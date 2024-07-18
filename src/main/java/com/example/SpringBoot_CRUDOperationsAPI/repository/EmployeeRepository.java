package com.example.SpringBoot_CRUDOperationsAPI.repository;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
