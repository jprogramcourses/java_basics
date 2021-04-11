package numbers;

public class AutoboxExercise {

	public static void main(String[] args) {
		
		int i = 23;
		
		int autobox = foo(i);
		
		System.out.println(autobox);
		
		Integer i1 = Integer.valueOf(23);
		System.out.println(i1.toString());
		
		int i2 = i1.intValue();
		System.out.println(i2);

	}
	
	public static Integer foo(Integer i) {
		return Integer.valueOf(i);
	}

}
