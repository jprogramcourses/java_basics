package java_collection.list;

import java.util.ArrayList;
import java.util.List;

public class PruebasList {

	public static void main(String[] args) {
	
		List<Student> listStudents = new ArrayList<>();
		Student student1 = new Student(12345, "John", "Doe");
		Student student2 = new Student(12345, "John", "Doe");
		Student student3 = student2;
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		
		System.out.println("List size 1: " + listStudents.size());
		
		listStudents.remove(student2);
		
		System.out.println("List size 2: " + listStudents.size());
		
	}

}
