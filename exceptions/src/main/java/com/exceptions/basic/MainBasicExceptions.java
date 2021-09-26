package com.exceptions.basic;

import com.exceptions.basic.examples.Euclid;

public class MainBasicExceptions {

    public static void main(String[] args) {

	try {
	    Euclid.euclid(args);
	} catch (SecurityException e) {
	    System.out.println("Controlado un error de seguridad");
	    e.printStackTrace();
	}

    }

}
