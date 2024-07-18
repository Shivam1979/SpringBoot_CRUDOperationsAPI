package com.example.SpringBoot_CRUDOperationsAPI.serviceimpl;

import com.example.SpringBoot_CRUDOperationsAPI.repository.EmployeeRepository;
import com.example.SpringBoot_CRUDOperationsAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

}
