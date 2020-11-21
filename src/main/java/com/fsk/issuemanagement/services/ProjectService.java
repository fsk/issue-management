package com.fsk.issuemanagement.services;

import com.fsk.issuemanagement.entities.Issue;
import com.fsk.issuemanagement.entities.IssueHistory;
import com.fsk.issuemanagement.entities.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project Project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);


}
