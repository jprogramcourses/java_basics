package com.juan.practicas.generics.bookjava8;

public class Wrapper<T> {
	
	private T ref;

	public Wrapper(T ref) {
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}

	public void setRef(T ref) {
		this.ref = ref;
	}

}
