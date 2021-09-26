package com.exceptions.basic.examples;

public class Euclid {

    public static void euclid(String args[]) throws SecurityException {
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
	    throw new SecurityException("Error de seguridad");
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
