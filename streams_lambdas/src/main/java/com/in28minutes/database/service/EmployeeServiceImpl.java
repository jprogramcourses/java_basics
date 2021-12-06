package com.in28minutes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.database.model.Employee;
import com.in28minutes.database.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findById(Long id) {
	return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
	return employeeRepository.findAll();
    }

}
