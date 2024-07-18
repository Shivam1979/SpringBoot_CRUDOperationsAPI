package com.example.SpringBoot_CRUDOperationsAPI.repository;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
