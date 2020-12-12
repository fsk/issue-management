package com.fsk.issuemanagement.services;

import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.entities.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDTO save(ProjectDTO project);

    ProjectDTO getById(Long id);

    Project getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);


    ProjectDTO update(Long id, ProjectDTO project);
}
