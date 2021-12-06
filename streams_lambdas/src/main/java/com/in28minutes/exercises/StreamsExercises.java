package com.in28minutes.exercises;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.in28minutes.database.model.Employee;
import com.in28minutes.database.model.Gender;

/**
 * There are three types of methods involved with Streams:
 * <ul>
 * <li>Stream-producing methods.</li>
 * <li>Stream-passing methods, which operate on a Stream and return a reference
 * to it, in order to allow for fluent programming: distinct(), filter(),
 * limit(), map(), peek(), sorted(), unsorted().</li>
 * <li>Stream-terminating methods, which conclude a streaming operation</li>
 * </ul>
 * -
 * 
 * @author juand
 *
 */
public class StreamsExercises {

    /**
     * Use the forEach function.
     * 
     * @param employees
     */
    public static void printListEmployees(List<Employee> employees) {
	employees.forEach(e -> System.out.println("Firstname: " + e.getFirst_name() + "; Gender: " + e.getGender()
		+ "; Birthdate: " + e.getBirth_date()));
    }

    public static void printListEmployeesByFirstname(List<Employee> employees) {
	employees.stream().sorted((e1, e2) -> e1.getFirst_name().compareTo(e2.getFirst_name()))
		.collect(Collectors.toList()).forEach(e -> System.out
			.println("Firstname: " + e.getFirst_name() + "; Birthdate: " + e.getBirth_date()));
    }

    public static void printListByGender(List<Employee> employees, Gender gender) {
	employees.stream().filter(emp -> emp.getGender().equals(gender)).collect(Collectors.toList())
		.forEach(e -> System.out.println("Firstname: " + e.getFirst_name() + "; Birthdate: " + e.getBirth_date()
			+ "; Gender: " + e.getGender()));
    }

    public static void printListBirthDateBeforeDate(List<Employee> employees, Date date) {
	employees.stream().filter(emp -> emp.getBirth_date().before(date)).collect(Collectors.toList()).forEach(
		e -> System.out.println("Firstname: " + e.getFirst_name() + "; Birthdate: " + e.getBirth_date()));
    }

}
