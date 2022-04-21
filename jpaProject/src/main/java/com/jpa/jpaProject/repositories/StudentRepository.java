package com.jpa.jpaProject.repositories;

import com.jpa.jpaProject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
