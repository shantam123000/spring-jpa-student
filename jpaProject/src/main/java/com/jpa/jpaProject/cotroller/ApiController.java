package com.jpa.jpaProject.cotroller;


import com.jpa.jpaProject.Dtos.DepartmentDataDto;
import com.jpa.jpaProject.models.Customer;
import com.jpa.jpaProject.models.Department;
import com.jpa.jpaProject.models.Product;
import com.jpa.jpaProject.models.Student;
import com.jpa.jpaProject.serviceProviders.CustomerServiceImp;
import com.jpa.jpaProject.serviceProviders.DepartmentServiceImp;
import com.jpa.jpaProject.serviceProviders.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    private final StudentServiceImp studentServiceImp;
    private final DepartmentServiceImp departmentServiceImp;
    private final CustomerServiceImp customerServiceImp;

    @Autowired
    ApiController(StudentServiceImp studentServiceImp, DepartmentServiceImp departmentServiceImp, CustomerServiceImp customerServiceImp) {
        this.studentServiceImp = studentServiceImp;
        this.departmentServiceImp = departmentServiceImp;
        this.customerServiceImp = customerServiceImp;
    }



    // Customer

    @GetMapping("/getAllCustomer")
    public List<Customer> getCustomers() {
        return customerServiceImp.getAllCustomers();
    }

    @GetMapping("/getOneCustomer/{id}")
    public DepartmentDataDto getCustomer(@PathVariable int id) {
        DepartmentDataDto departmentDataDto = new DepartmentDataDto();
        departmentDataDto.setCustomer(customerServiceImp.getCustomer(id));
        return departmentDataDto;
    }

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody DepartmentDataDto departmentDataDto) {
        customerServiceImp.addCustomer(departmentDataDto);
    }


    // Department

    @GetMapping("/getAllDepartment")
    public List<Department> getDepartments() {
        return departmentServiceImp.getAllDepartment();
    }

    @GetMapping("/getOneDepartment/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentServiceImp.getDepartment(id);
    }

    @PostMapping("/addDepartment")
    public String addDepartment(@RequestBody List<Department> departments) {
        return departmentServiceImp.addDepartment(departments);
    }

    // Student

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
