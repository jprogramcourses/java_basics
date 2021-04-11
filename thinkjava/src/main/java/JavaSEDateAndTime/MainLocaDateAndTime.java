package JavaSEDateAndTime;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainLocaDateAndTime {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalTime thisTime = LocalTime.now();
		System.out.println("Time: " + thisTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("DateTime: " + currentDateTime);
		
		LocalDateTime differentCurrentTime = currentDateTime.withMinute(14).withDayOfMonth(3).plusHours(1);
		System.out.println("DifferentCurrentTime: " + differentCurrentTime);
		
		LocalDate someDay = LocalDate.of(2021, Month.NOVEMBER, 18);
		System.out.println("Some day: " + someDay);
		
		LocalTime someTime = LocalTime.of(11, 6);
		System.out.println("Some time: " + someTime);
		
		LocalDateTime otherDateTime = LocalDateTime.of(2021, Month.NOVEMBER, 18,13, 45);
		System.out.println("otherDateTime: " + otherDateTime);
		
		LocalDateTime someDateTime = someDay.atTime(someTime);
		System.out.println("someDateTimee: " + someDateTime);
		
		LocalDate whatWasTheDate = someDateTime.toLocalDate();
		System.out.println("whatWasTheDate: " + whatWasTheDate);
		
		System.out.println("*************** Practice 3.3 ****************");
		
		practice33();
		
	}
	
	private static void practice33() {
		
		System.out.println("Retrieve day of week in next year");
		
		LocalDate today = LocalDate.now();
		System.out.println("Day next year: " + today.plusYears(1).getDayOfWeek());
		
		LocalTime teaTime = LocalTime.of(17, 30);
		Duration timeGap = Duration.between(LocalTime.now(), teaTime);
		System.out.println("Duration time gap: " + timeGap);
		
		System.out.println("Duration, hours, minutes, seconds: " + timeGap.toHours() + ", " + timeGap.toMinutes() + ", " + timeGap.toMinutesPart());
		
		LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
		
		System.out.println("London time: " + tomorrowTeaTime);
		
		ZoneId london = ZoneId.of("Europe/London");
		ZoneId katmandu = ZoneId.of("Asia/Katmandu");
		
		ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
		ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
		
		System.out.println("London zone time: " + londonTime);
		System.out.println("Katmandu zone time: " + katmanduTime);
		
		
		// DateTimeFormatter
		String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";
		
		Locale locale = Locale.UK;
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
		
		System.out.println("Date format: " + dateFormat);
		System.out.println("Date string: " + dateFormat.format(londonTime));
		
		System.out.println("***************** Practice 3.4 ****************");
		
		String teaTxt = "Tea";
		BigDecimal priceTea = BigDecimal.valueOf(1.85);
		BigDecimal rateTea = BigDecimal.valueOf(0.065);
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
				
		percentFormat.setMaximumFractionDigits(2);
		
		String priceTeaTxt = currencyFormat.format(priceTea);
		String rateTeaTxt = percentFormat.format(rateTea);
		
		practice34(locale, teaTxt, priceTeaTxt, rateTeaTxt, dateFormat.format(londonTime));
		
	}
	
	private static void practice34(Locale locale, String product, String currency, String rate, String date) {
		
		ResourceBundle msg = ResourceBundle.getBundle("messages", locale);
		
		String offerPattern = msg.getString("offer");
		
		System.out.println("OfferPattern: " + offerPattern);
		
		String msgResult = MessageFormat.format(offerPattern, product, currency, rate, date);
		
		System.out.println("Result: " + msgResult);
	}
	
	private void retrieveNumberFormatByLocale(Locale locale) {
		
	}

}
