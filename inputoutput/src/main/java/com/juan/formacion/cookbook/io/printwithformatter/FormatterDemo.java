package com.juan.formacion.cookbook.io.printwithformatter;

import java.util.Formatter;

public class FormatterDemo {
	
	public static void examplesFormatter() {
		
		Formatter fmtr = new Formatter();
		Object result = fmtr.format("%1$04d - the year of %2$f", 1956, Math.PI);
		System.out.println(result);
		fmtr.close();
		
		Object stringResult = String.format("%04d - the year of %f", 1980, Math.PI);
		System.out.println(stringResult);
		
		System.out.printf("%04d - the year of %f%n", 1980, Math.PI);
		
		System.out.printf("PI is approximately %4.2f%n", Math.PI);
		
	}

	
}
