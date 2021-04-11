package com.juan.formacion.cookbook.io.printwithformatter;

public class MainPrintFormatter {

	public static void main(String[] args) {


		System.out.printf("%1$04d - second argument: %2$f%n", 1980, Math.PI);
		System.out.printf("%04d - second argument: %f%n", 1980, Math.PI);
		System.out.printf("%04d - second argument: %f%n", 980, Math.PI);
		
		System.out.println("********* FormatterDemo ***************");
		FormatterDemo.examplesFormatter();
		
		FormatterDates.examplesFormatDate();

	}

}
