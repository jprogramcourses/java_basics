package com.juan.practicas.generics.bookjava8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WrapperUtilTest2<T> {

	@Test
	void test() {
		Wrapper<String> stringWrapper = new Wrapper<>("Hello");
		Wrapper<Integer> integerWrapper = new Wrapper<>(new Integer(123));
		
		Class stringClass = stringWrapper.getClass();
		Class integerClass = integerWrapper.getClass();
		
		System.out.println("Class for string class: " + stringClass.getName());
		System.out.println("Class for integer class: " + integerClass.getName());
		
		System.out.println("StringClass == IntegerClass: " + (stringClass == integerClass));
	}

	public <V> void m1(Wrapper<V> a, Wrapper<V> b, T c) {
		
	}
}
