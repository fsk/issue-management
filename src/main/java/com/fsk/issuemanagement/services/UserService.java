package com.fsk.issuemanagement.services;

import com.fsk.issuemanagement.entities.IssueHistory;
import com.fsk.issuemanagement.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User User);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUserName(String userName);

}
