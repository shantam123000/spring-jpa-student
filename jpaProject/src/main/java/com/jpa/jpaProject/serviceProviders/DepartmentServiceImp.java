package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.models.Department;
import com.jpa.jpaProject.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    DepartmentServiceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;

    }

    @Override
    public List<Department> getAllDepartment() {

        List<Department> departments = null;

        departments = departmentRepository.findAll();

        return departments;


    }

    @Override
    public Department getDepartment(Long id) {

        Department department = null;

        department = departmentRepository.findById(id).get();

        return null;
    }

    @Override
    public String addDepartment(List<Department> departments) {

        if (departments.isEmpty()) {
            return "invalid data";
        } else {
            departmentRepository.saveAll(departments);
        }

        return "data added";
    }
}
