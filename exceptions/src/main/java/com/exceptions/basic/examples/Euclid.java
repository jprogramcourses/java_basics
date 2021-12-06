package com.exceptions.basic.examples;

import org.apache.log4j.Logger;

import com.exceptions.basic.examples.exceptions.EuclidExceptions;

public class Euclid {

    private static Logger LOGGER = Logger.getLogger(Euclid.class);

    public static void euclid(String args[]) throws EuclidExceptions {
	int a = 2701;
	int b = 222;
	if (args != null && args.length == 2) {
	    int i = 0;
	    for (String arg : args) {
		i++;
		try {
		    if (i == 1) {
			a = Integer.parseInt(arg);
		    } else {
			b = Integer.parseInt(arg);
		    }
		} catch (NumberFormatException e) {
		    System.out.println("Arguments were not both numbers. Using defaults.");
		}
	    }
	} else {
	    System.err.println("Wrong number of arguments. Using defaults");
	    LOGGER.info("Incorrect number of arguments " + args.length);
	    assert (args.length > 2) : "Wrong number of arguments. Assert";
	    EuclidExceptions ee = new EuclidExceptions("Error en el método de Euclides", 10);
	    throw ee;
	}
	System.out.println("The GCD of " + a + " and " + b + "is ");
	while (b != 0) {
	    if (a > b) {
		a = a - b;
	    } else {
		b = b - a;
	    }
	}
	System.out.println(a);
    }

}
