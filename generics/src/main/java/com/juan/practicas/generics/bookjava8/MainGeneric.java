package com.juan.practicas.generics.bookjava8;

public class MainGeneric {

	public static void main(String[] args) {
		
		Wrapper<Object> objectWrapper = new Wrapper<Object>(new Object());
		WrapperUtil.printDetails(objectWrapper);
		
		Wrapper<Integer> intNumber = new Wrapper<>(10);
		Wrapper<Double> longNumber = new Wrapper<>(2.2);
		
		double resultSum = WrapperUtil.sum(intNumber, longNumber);
		System.out.println("Result: " + resultSum);
		
		Wrapper<Object> objectWrapper2 = new Wrapper<>(new Object());
		Wrapper<String> stringWrapper2 = new Wrapper<>("Hello");
		Wrapper<String> stringWrapper3 = new Wrapper<>("Hello");
		WrapperUtil.copy(stringWrapper2, objectWrapper2);

	}

}
