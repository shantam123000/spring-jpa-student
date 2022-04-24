package com.jpa.jpaProject.repositories;

import com.jpa.jpaProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
