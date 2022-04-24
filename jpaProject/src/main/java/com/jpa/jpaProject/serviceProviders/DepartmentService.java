package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.models.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepartment();

    Department getDepartment(Long id);

    String addDepartment(List<Department> departments);


}
