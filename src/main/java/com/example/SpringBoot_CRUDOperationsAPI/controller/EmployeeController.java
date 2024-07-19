package com.example.SpringBoot_CRUDOperationsAPI.controller;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import com.example.SpringBoot_CRUDOperationsAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


    //End point to delete an employee
    @DeleteMapping("/{id}")
    public Boolean deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return true;
    }


    @GetMapping("/get-employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Optional<Employee> getEmployee = employeeService.getEmployeeById(id);
        if (getEmployee.isPresent()){
            return new ResponseEntity<>(getEmployee.get(), HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/get-all-employee")
    public ResponseEntity<List<Employee>> getAllEmployee(Employee employee){
        List<Employee> getAllEmployee = employeeService.getAllEmployee();
        return new ResponseEntity<>(getAllEmployee, HttpStatus.FOUND);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Employee>> findByName(@PathVariable String name){
        List<Employee> findByName = employeeService.findByName(name);

        if (findByName.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(findByName, HttpStatus.FOUND);
        }
    }
}
