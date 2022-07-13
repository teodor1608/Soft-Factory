package com.soft_factory.controllers;

import com.soft_factory.entities.Employee;
import com.soft_factory.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation. RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepo;

    EmployeeController(EmployeeRepository employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/fetch")
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

}
