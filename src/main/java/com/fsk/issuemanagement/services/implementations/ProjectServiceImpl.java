package com.fsk.issuemanagement.services.implementations;

import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.entities.Project;
import com.fsk.issuemanagement.repositories.ProjectRepository;
import com.fsk.issuemanagement.services.ProjectService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;


    @Override
    public ProjectDTO save(ProjectDTO project) {

        Project projectCheck = projectRepository.getByProjectCode(project.getProjectCode());

        if (projectCheck!=null)
            throw new IllegalArgumentException("Project Code Already Exist.");

        Project p = modelMapper.map(project, Project.class);
        p = projectRepository.save(p);
        project.setId(p.getId());
        return project;
    }

    @Override
    public ProjectDTO getById(Long id) {
        Project project =  projectRepository.getOne(id);
        return modelMapper.map(project, ProjectDTO.class);

    }

    @Override
    public Project getByProjectCode(String projectCode) {

        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }

    @Override
    public ProjectDTO update(Long id, ProjectDTO project) {

        Project projectDb = projectRepository.getOne(id);

        if (projectDb == null)
            throw  new IllegalArgumentException("Project Does Not Exist.! ID: " + id);

        Project projectCheck = projectRepository.getByProjectCodeAndIdNot(project.getProjectCode(), id);

        if (projectCheck!=null && projectCheck.getId() != projectDb.getId())
            throw new IllegalArgumentException("Project Code Already Exist.");

        projectDb.setProjectCode(project.getProjectCode());
        projectDb.setProjectName(project.getProjectName());

        projectRepository.save(projectDb);
        return modelMapper.map(projectDb, ProjectDTO.class);
    }
}
