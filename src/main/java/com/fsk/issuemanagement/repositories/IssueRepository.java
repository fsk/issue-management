package com.fsk.issuemanagement.repositories;

import com.fsk.issuemanagement.entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
