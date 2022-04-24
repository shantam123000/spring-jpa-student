package com.jpa.jpaProject.Dtos;

import com.jpa.jpaProject.models.Customer;
import com.jpa.jpaProject.models.Department;
import com.jpa.jpaProject.models.Product;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class DepartmentDataDto {

    private Customer customer;

    private Product product;


}
