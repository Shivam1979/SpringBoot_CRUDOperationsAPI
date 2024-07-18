package com.example.SpringBoot_CRUDOperationsAPI.service;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Optional getEmployeeById(Long id);
//    void deleteEmployee(Long id);
//    Employee updateEmployee(Long id, Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> findByName(String name);

}
