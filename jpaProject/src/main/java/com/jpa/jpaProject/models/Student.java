package com.jpa.jpaProject.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Student {

    @Id
    private int studentId;

    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;


}
