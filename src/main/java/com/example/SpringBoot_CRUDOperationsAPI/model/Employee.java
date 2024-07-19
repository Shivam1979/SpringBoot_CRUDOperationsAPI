package com.example.SpringBoot_CRUDOperationsAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

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


//    public Object getPhoneNumber() {
//        return null;
//    }
}
