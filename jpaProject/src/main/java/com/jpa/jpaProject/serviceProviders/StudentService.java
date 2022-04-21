package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.models.Student;

import java.util.List;

public interface StudentService {


    List<Student> getAllStudents();

    Student getStudent(int id);

    String addStudent(Student student);

    String updateStudent(Student student);

    String deleteStudent(int id);

}
