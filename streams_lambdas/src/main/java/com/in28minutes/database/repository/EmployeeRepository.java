package com.in28minutes.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.database.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
