package com.example.SpringBoot_CRUDOperationsAPI.service;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
    Employee updateEmployee(Long id, Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> findByName(String name);

}
