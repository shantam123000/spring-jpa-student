package com.jpa.jpaProject.serviceProviders;

import com.jpa.jpaProject.Dtos.DepartmentDataDto;
import com.jpa.jpaProject.models.Customer;
import com.jpa.jpaProject.repositories.CustomerRepository;
import com.jpa.jpaProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    @Autowired
    CustomerServiceImp(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        if (customerRepository.findById(id).isPresent()) {
            return customerRepository.findById(id).get();
        } else {
            return null;
        }

    }

    @Override
    public void addCustomer(DepartmentDataDto departmentDataDto) {
//        productRepository.save(departmentDataDto.getProduct());
        customerRepository.save(departmentDataDto.getCustomer());
    }
}
