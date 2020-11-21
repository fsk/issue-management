package com.fsk.issuemanagement.services;

import com.fsk.issuemanagement.entities.Issue;
import com.fsk.issuemanagement.entities.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    Issue save(Issue issue);

    Issue getById(Long id);

    Page<Issue> getAllPageable(Pageable pageable);

    Boolean delete(Issue issue);
}
