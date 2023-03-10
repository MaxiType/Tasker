package com.practice.Tasker.domain.repository;

import com.practice.Tasker.domain.entity.tasker.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    boolean existsByName(String name);
    Optional<Project> findByName(String name);
}
