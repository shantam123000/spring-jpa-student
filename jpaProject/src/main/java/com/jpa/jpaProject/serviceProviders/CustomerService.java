package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.Dtos.DepartmentDataDto;
import com.jpa.jpaProject.models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomer(int id);

    void addCustomer(DepartmentDataDto departmentDataDto);

}
