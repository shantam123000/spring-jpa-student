package com.jpa.jpaProject.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Department {

    @Id
    private Long id;

    private String departmentName;

    @OneToMany(targetEntity = Student.class)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Student> students;

}
