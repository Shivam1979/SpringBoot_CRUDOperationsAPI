package com.example.SpringBoot_CRUDOperationsAPI.serviceimpl;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import com.example.SpringBoot_CRUDOperationsAPI.repository.EmployeeRepository;
import com.example.SpringBoot_CRUDOperationsAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }
    
    @Override
    public Optional getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }


}
