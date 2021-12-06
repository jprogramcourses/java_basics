package com.in28minutes.database.service;

import java.util.List;

import com.in28minutes.database.model.Employee;

public interface IEmployeeService {

    Employee findById(Long id);

    List<Employee> findAll();

}
