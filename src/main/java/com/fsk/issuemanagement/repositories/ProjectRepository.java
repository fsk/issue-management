package com.fsk.issuemanagement.repositories;

import com.fsk.issuemanagement.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
