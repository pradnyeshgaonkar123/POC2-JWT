package com.poc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc2.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
