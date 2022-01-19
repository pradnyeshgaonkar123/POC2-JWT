package com.poc2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc2.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<com.poc2.model.Project, Long>{
	
	List<Project> findByStudentId(Long id);
}
