package com.jpa.jpaProject.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    private int productId;

    private String productName;
    private String productDescription;

}
