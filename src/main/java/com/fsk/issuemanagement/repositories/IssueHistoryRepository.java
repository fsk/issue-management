package com.fsk.issuemanagement.repositories;

import com.fsk.issuemanagement.entities.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}
