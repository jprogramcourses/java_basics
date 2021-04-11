package JavaSELocale;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainJavaSELocale {

	public static void main(String[] args) {
		
		Locale uk = new Locale("en", "GB");
		Locale us = new Locale("en", "US");
		
		Locale es = new Locale("es");
		
		Locale current = Locale.getDefault();
		System.out.println("Current locale: " + current);
		
		BigDecimal price = BigDecimal.valueOf(2.99);
		Double tax = 0.2;
		int quantity = 12345;
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(uk);
		NumberFormat percentageFormat = NumberFormat.getPercentInstance(uk);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(uk);
		
		String formattedPrice = currencyFormat.format(price);
		String formattedTax = percentageFormat.format(tax);
		String formattedQuantity = numberFormat.format(quantity);
		
		System.out.println("Format price: " + formattedPrice);
		System.out.println("Format tax: " + formattedTax);
		System.out.println("Format quantity: " + formattedQuantity);
		
		// Parse
		try {
			BigDecimal parsePrice = (BigDecimal)currencyFormat.parse("£1.75");
			System.out.println("Parse price: " + parsePrice);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
