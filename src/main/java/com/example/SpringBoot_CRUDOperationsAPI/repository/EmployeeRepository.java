package com.example.SpringBoot_CRUDOperationsAPI.repository;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
