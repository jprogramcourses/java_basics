package java_collection.maps;

import java.util.HashMap;

import java_collection.list.Student;

public class PruebaHashMap {
	
	public void createHashMap () {
		HashMap<Integer, Student> map = new HashMap<>();
		
		Student st1 = new Student(12345, "John", "Doe");
		Student st2 = new Student(12345, "Mariela", "Doe");
		Student st3 = new Student(12346, "Jane", "Doe");
		Student st4 = new Student(12347, "Micaela", "Doe");
		Student st5 = new Student(12348, "Perico", "Doe");
		
		map.put(st1.getStudentId(), st1);
		map.put(st2.getStudentId(), st2);
		map.put(st3.getStudentId(), st3);
		map.put(st4.getStudentId(), st4);
		map.put(st5.getStudentId(), st5);
	}

}
