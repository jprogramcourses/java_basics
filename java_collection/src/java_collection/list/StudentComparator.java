package java_collection.list;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int relativeValue = s2.getStudentId() - s1.getStudentId();
		return relativeValue;
	}

}
