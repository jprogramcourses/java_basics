package com.juan.practicas.generics.bookjava8;

public class WrapperUtil {
	
	public static void printDetails(Wrapper<?> wrapper) {
		
		String className = null;
		
		if(wrapper != null) {
			className = wrapper.getClass().getName();
			
		}
		
		System.out.println("Class: " + className);
		
	}
	
	// Method that should accept two numbers thar are wrapped in Wrapper object, and it will return their sum
	public static double sum(Wrapper<? extends Number> n1, Wrapper<? extends Number> n2) {
		
		Number num1 = n1.getRef();
		Number num2 = n2.getRef();
		
		double sum = num1.doubleValue() + num2.doubleValue();
		
		return sum;
	}
	
	public static <T> void copy(Wrapper<T> source, Wrapper<? super T> dest) {
		T value = source.getRef();
		dest.setRef(value);
	}
	
	
}
