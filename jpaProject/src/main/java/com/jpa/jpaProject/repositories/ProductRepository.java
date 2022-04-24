package com.jpa.jpaProject.repositories;

import com.jpa.jpaProject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
