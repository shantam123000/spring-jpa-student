package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.models.Student;
import com.jpa.jpaProject.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();

        if (studentRepository.count() > 0) {
            students = studentRepository.findAll();
        }
        return students;
    }

    @Override
    public Student getStudent(int id) {

        Student student = new Student();
        System.out.println(studentRepository.count());
        if (studentRepository.findById(id).isPresent()) {
            student = studentRepository.findById(id).get();
        }
        return student;

    }

    @Override
    public String addStudent(Student student) {

        if (student == null) {
            return "invalid data";
        } else {
            studentRepository.save(student);
            return "Student added";
        }
    }

    @Override
    public String updateStudent(Student student) {

        if (!studentRepository.findAllById(Collections.singleton(student.getStudentId())).isEmpty()) {
            studentRepository.save(student);
            return "student data updated " + student.getStudentName();
        } else {
            return "invalid data";
        }
    }

    @Override
    public String deleteStudent(int id) {

        if (studentRepository.findById(id).isPresent()) {
            studentRepository.deleteAll(studentRepository.findAllById(Collections.singleton(id)));
            return "student data deleted ";
        } else {
            return "invalid data";
        }
    }

}
