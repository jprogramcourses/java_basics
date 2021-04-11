package JavaSEBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class MainPracticeBigDecimal {
	
	
	static double priceDouble;
	static double rateDouble;
	
	static BigDecimal priceBigDecimal;
	static BigDecimal rateBigDecimal;

	public static void main(String[] args) {
		
		priceBigDecimal = BigDecimal.valueOf(12.99);
		rateBigDecimal = BigDecimal.valueOf(0.2);
		BigDecimal tax = priceBigDecimal.multiply(rateBigDecimal);
		
		System.out.println("Tax: " + tax);
		
		priceBigDecimal = priceBigDecimal.add(tax);
		
		System.out.println("Price: " + priceBigDecimal);

		priceBigDecimal = priceBigDecimal.setScale(2, RoundingMode.HALF_DOWN);
		
		System.out.println("Price half up: " + priceBigDecimal);

		System.out.println("**************** Practice 3.2 ***************");
		practice32();

		System.out.println("**************** Practice 3.2 Locale ***************");
		practice32Locale();
		
	}
	
	private static void practice32() {
		
		priceDouble = 1.85;
		rateDouble = 0.065;
		
		priceDouble = priceDouble * rateDouble;
		
		System.out.println("Price: " + priceDouble);
		
		priceDouble = Math.round(priceDouble*100)/100.0;
		System.out.println("Price round: " + priceDouble);
		
		priceBigDecimal = BigDecimal.valueOf(1.85);
		rateBigDecimal = BigDecimal.valueOf(0.065);
		
		System.out.println("Price big decimal: " + priceBigDecimal);
		
		priceBigDecimal = priceBigDecimal.subtract(priceBigDecimal.multiply(rateBigDecimal)).setScale(2, RoundingMode.HALF_DOWN);
		System.out.println("Price round big decimal: " + priceBigDecimal);
		
	}
	
	private static void practice32Locale() {
		
		Locale locale = Locale.FRANCE;
		
		priceDouble = 1.73;
		rateDouble = 0.065;
		
		System.out.println("Currency: " + priceDouble);
		System.out.println("Percent: " + rateDouble);
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
		
		percentFormat.setMaximumFractionDigits(2);
		
		System.out.println("Currency format: " + currencyFormat.format(priceDouble));
		System.out.println("Percent format: " + percentFormat.format(rateDouble));
		
		// Change locale to uk
		locale = Locale.UK;
		
		currencyFormat = NumberFormat.getCurrencyInstance(locale);
		percentFormat = NumberFormat.getPercentInstance(locale);
		
		percentFormat.setMaximumFractionDigits(2);
		
		System.out.println("Currency format: " + currencyFormat.format(priceDouble));
		System.out.println("Percent format: " + percentFormat.format(rateDouble));
		
		
		
		
	}

}
