package com.jpa.jpaProject.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Customer {

    @Id
    private int customerId;

    private String customerName;
    private String customerAddress;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk", referencedColumnName = "customerId")
    private List<Product> productList;
}
