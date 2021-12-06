package dates.exerc6_5_differencesbetweendates;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenDates {

    public static void main(String[] args) {
	LocalDate endOf20thCentury = LocalDate.of(2000, 12, 31);
	LocalDate now = LocalDate.now();
	differenceBetweenDates(endOf20thCentury, now);
    }

    private static void differenceBetweenDates(LocalDate init, LocalDate end) {
	Period diff = Period.between(init, end);
	System.out.printf("The 21st century (up to %s) is %s old%n", init, diff);
	System.out.printf("The 21st century is %d years, %d months and %d days old", diff.getYears(), diff.getMonths(),
		diff.getDays());
    }

}
