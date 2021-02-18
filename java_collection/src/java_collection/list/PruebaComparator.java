package java_collection.list;

import java.util.Collection;
import java.util.TreeSet;

public class PruebaComparator {

	public static void main(String[] args) {
		
		Collection<Student> collectionStudents = new TreeSet<>(new StudentComparator());
		Student student1 = new Student(12345, "John", "Doe");
		Student student2 = new Student(12346, "Marilin", "Doe");
		Student student3 = new Student(12350, "Curruquita", "Doe");
		Student student4 = new Student(12400, "Pachon", "Doe");
		Student student5 = new Student(21025, "Mierder", "Doe");
		collectionStudents.add(student1);
		collectionStudents.add(student2);
		collectionStudents.add(student3);
		collectionStudents.add(student4);
		collectionStudents.add(student5);
		
		for(Student s : collectionStudents) {
			System.out.println("Student: " + s.getStudentId() + ", " + s.getFirstName());
		}

	}

}
