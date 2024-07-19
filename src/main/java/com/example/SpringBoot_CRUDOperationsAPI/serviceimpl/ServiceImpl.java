package com.example.SpringBoot_CRUDOperationsAPI.serviceimpl;

import com.example.SpringBoot_CRUDOperationsAPI.model.Employee;
import com.example.SpringBoot_CRUDOperationsAPI.repository.EmployeeRepository;
import com.example.SpringBoot_CRUDOperationsAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setSalary(updatedEmployee.getSalary());
            existingEmployee.setDomain(updatedEmployee.getDomain());
            existingEmployee.setDesignation(updatedEmployee.getDesignation());
            return employeeRepository.save(existingEmployee);
        }else {
            throw new RuntimeException("Employee not found with id: " + id);
        }


}

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
