package java_collection.list;

public class Student implements Comparable<Student> {
	
	private int studentId;
	private String firstName;
	private String lastName;
	
	public Student(int studentId, String firstName, String lastName) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + studentId;
//		return result;
		
		return this.getStudentId();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj instanceof Student) {
			Student target = (Student) obj;
			isEqual = (target.getStudentId() == this.getStudentId());
		}
		return isEqual;
	}

	@Override
	public int compareTo(Student o) {
		assert(o != null);
		int relativeValue = lastName.compareTo(o.getLastName());
		if(relativeValue == 0) {
			relativeValue = firstName.compareTo(o.getFirstName());
		}
		return relativeValue;
	}
	
}
