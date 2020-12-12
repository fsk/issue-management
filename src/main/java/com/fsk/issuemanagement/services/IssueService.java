package com.fsk.issuemanagement.services;

import com.fsk.issuemanagement.dto.IssueDTO;
import com.fsk.issuemanagement.entities.Issue;
import com.fsk.issuemanagement.entities.IssueHistory;
import com.fsk.issuemanagement.utils.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDTO save(IssueDTO issue);

    IssueDTO getById(Long id);

    TPage<IssueDTO> getAllPageable(Pageable pageable);

    Boolean delete(Long id);

    IssueDTO update(Long id, IssueDTO issue);
}
