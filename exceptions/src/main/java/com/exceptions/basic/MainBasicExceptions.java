package com.exceptions.basic;

import com.exceptions.basic.examples.Euclid;
import com.exceptions.basic.examples.exceptions.EuclidExceptions;

public class MainBasicExceptions {

    public static void main(String[] args) {

	try {
	    Euclid.euclid(args);
	} catch (EuclidExceptions e) {
	    System.out.println("Controlado un error de seguridad");
	    e.printStackTrace();
	    e.getLineNumber();
	}

    }

}
