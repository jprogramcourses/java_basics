package com.in28minutes.database;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.model.Employee;
import com.in28minutes.database.service.IEmployeeService;
import com.in28minutes.exercises.StreamsExercises;

@SpringBootApplication
public class StreamsLambdasApplication implements CommandLineRunner {

    @Autowired
    private IEmployeeService employeeService;

    public static void main(String[] args) {
	SpringApplication.run(StreamsLambdasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

	System.out.println("Consola de Streams lambdas");

	List<Employee> empleados = employeeService.findAll();
//	StreamsExercises.printListEmployees(empleados);

	System.out.println("********************************************************************");

//	StreamsExercises.printListEmployeesByFirstname(empleados);

	System.out.println("******************* PRINT BY GENDER ****************************");
//	StreamsExercises.printListByGender(empleados, Gender.F);

	System.out.println("******************* PRINT BEFORE DATE ****************************");
	StreamsExercises.printListBirthDateBeforeDate(empleados, new Date("1-1-1960"));

    }

}
