package com.jpa.jpaProject.cotroller;


import com.jpa.jpaProject.models.Student;
import com.jpa.jpaProject.serviceProviders.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    private final StudentServiceImp studentServiceImp;

    @Autowired
    ApiController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        List<Student> allStudents = studentServiceImp.getAllStudents();
        return allStudents;
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentServiceImp.getStudent(id);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentServiceImp.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student) {
        return studentServiceImp.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentServiceImp.deleteStudent(id);
    }


}
