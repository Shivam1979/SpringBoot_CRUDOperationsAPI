package com.example.SpringBoot_CRUDOperationsAPI.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Employee {
    public Employee(long id, String name, long salary, String domain, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.domain = domain;
        this.designation = designation;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private long salary;

    @Column(name = "domain")
    private String domain;

    @Column(name = "designation")
    private String designation;
}
