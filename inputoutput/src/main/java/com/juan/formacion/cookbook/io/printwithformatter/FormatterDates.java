package com.juan.formacion.cookbook.io.printwithformatter;

import java.time.LocalDate;

public class FormatterDates {
	
	public static void examplesFormatDate() {
		
		LocalDate today = LocalDate.now();
		System.out.printf("Today is %1$tB %1$td, %1$tY%n", today);
		
	}

}
