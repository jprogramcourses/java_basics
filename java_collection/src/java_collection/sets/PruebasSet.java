package java_collection.sets;

import java.util.Collection;
import java.util.HashSet;

import java_collection.list.Student;

public class PruebasSet {

	public static void main(String[] args) {
		
		Collection<Student> setStudents = new HashSet<>();
		
		Student st1 = new Student(12345, "John", "Doe");
		Student st2 = new Student(12345, "Mariela", "Doe");
		Student st3 = new Student(12346, "Jane", "Doe");
		Student st4 = new Student(12347, "Micaela", "Doe");
		Student st5 = new Student(12348, "Perico", "Doe");
		
		setStudents.add(st1);
		setStudents.add(st2);
		setStudents.add(st3);
		setStudents.add(st4);
		setStudents.add(st5);
		
		System.out.println("Tamaño del conjunto: " + setStudents.size());

	}

}
