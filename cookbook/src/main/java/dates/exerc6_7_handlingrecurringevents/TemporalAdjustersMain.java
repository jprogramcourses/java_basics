package dates.exerc6_7_handlingrecurringevents;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersMain {

    public static void main(String[] args) {

	LocalDate now = LocalDate.now();
	LocalDate date1 = LocalDate.parse("2021-11-01");
	LocalDate thisMeeting = date1.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.WEDNESDAY));
	System.out.println(thisMeeting);

	if (thisMeeting.isBefore(now)) {
	    thisMeeting = thisMeeting.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.WEDNESDAY));
	}
	System.out.println(thisMeeting);
    }

}
