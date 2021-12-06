package dates.exerc6_4_parsingstrings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParsingStringMain {

    private static final String PATTERN_1 = "dd-MM-yyyy";
    private static final String PATTERN_2 = "dd MMM uuuu";

    public static void main(String[] args) {

	DateTimeFormatter df1 = DateTimeFormatter.ofPattern(PATTERN_1);
	String date1 = "2021-11-26";
	String date2 = "28-11-2021";
	parsingStringDate(date1, null);
	parsingStringDate(date2, df1);

	String dateTime1 = "1980-11-18T10:30";
	parsingStringDateTime(dateTime1, null);

	DateTimeFormatter df2 = DateTimeFormatter.ofPattern(PATTERN_2);
	String dateDf21 = "18 Nov 2021";
	parsingStringDate(dateDf21, df2);

    }

    private static void parsingStringDate(String stringDate, DateTimeFormatter dateTimeFormatter) {
	LocalDate localDate = null;
	try {
	    if (dateTimeFormatter == null) {
		localDate = LocalDate.parse(stringDate);
	    } else {
		localDate = LocalDate.parse(stringDate, dateTimeFormatter);
		System.out.println(localDate + " format as " + dateTimeFormatter.format(localDate));
	    }
	} catch (DateTimeParseException e) {
	    e.printStackTrace();
	}

	System.out.println("Date " + localDate);

    }

    private static void parsingStringDateTime(String stringDateTime, DateTimeFormatter dateTimeFormatter) {
	LocalDateTime localDateTime = null;
	try {
	    if (dateTimeFormatter == null) {
		localDateTime = LocalDateTime.parse(stringDateTime);
	    } else {
		localDateTime = LocalDateTime.parse(stringDateTime, dateTimeFormatter);
	    }
	} catch (DateTimeParseException e) {
	    e.printStackTrace();
	}

	System.out.println("LocalDateTime: " + localDateTime);
    }

}
