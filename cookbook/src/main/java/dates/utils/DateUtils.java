package dates.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;

public class DateUtils {

    /**
     * 
     * @return a <code>LocalDateTime</code> with the currente date.
     */
    public static Temporal currentDateTime(String period) {
	if (period != null) {
	    switch (period) {
	    case "date":
		LocalDate dNow = LocalDate.now();
		return dNow;
	    case "time":
		LocalTime tNow = LocalTime.now();
		return tNow;
	    default:
		LocalDateTime now = LocalDateTime.now();
		return now;
	    }
	}
	return null;
    }

}
