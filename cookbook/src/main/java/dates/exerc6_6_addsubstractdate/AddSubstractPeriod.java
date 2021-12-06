package dates.exerc6_6_addsubstractdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AddSubstractPeriod {

    public static void main(String[] args) {

	addPeriod(LocalDate.now(), 8);
	addPeriod(LocalDate.parse("13-12-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 15);

    }

    private static void addPeriod(LocalDate init, Integer period) {
	Period p = Period.ofDays(period);
	LocalDate then = init.plus(p);

	System.out.printf(period + " days from %s is %s%n", init, then);
    }

}
