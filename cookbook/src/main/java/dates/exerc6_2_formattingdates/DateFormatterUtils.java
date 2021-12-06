package dates.exerc6_2_formattingdates;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterUtils {

    public static void dateTimeFormatterExample1(String stringPattern) {
	DateTimeFormatter df = DateTimeFormatter.ofPattern(stringPattern);
	System.out.println("Today: " + df.format(LocalDate.now()));

	System.out.println(LocalDate.parse("2021/11/26", df));

	DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
	System.out.println(ZonedDateTime.now().format(nTZ));
    }

}
