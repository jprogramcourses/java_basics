package dates.exerc6_8_datesinvolvingtimezone;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeExample {

    static Duration driveTime = Duration.ofHours(1);

    public static void main(String[] args) {

	LocalDateTime when = null;
	if (args.length == 0) {
	    when = LocalDateTime.now();
	} else {
	    String time = args[0];
	    LocalTime localTime = LocalTime.parse(time);
	    when = LocalDateTime.of(LocalDate.now(), localTime);
	}

	calculateArrivalTime(when);

    }

    private static void calculateArrivalTime(LocalDateTime takeOffTime) {
	ZoneId torontoZone = ZoneId.of("America/Toronto"), madridZone = ZoneId.of("Europe/Paris");
	ZonedDateTime takeOffTimeZoned = ZonedDateTime.of(takeOffTime, torontoZone);
	Duration flightTime = Duration.ofHours(5).plus(10, ChronoUnit.MINUTES);

	System.out.println("Duration: " + flightTime);

	ZonedDateTime arrivalTimeUnZoned = takeOffTimeZoned.plus(flightTime);
	ZonedDateTime arrivalTimeZoned = arrivalTimeUnZoned.toInstant().atZone(madridZone);
	ZonedDateTime phoneTimeHere = arrivalTimeUnZoned.minus(driveTime);

	System.out.println("Flight departure time " + takeOffTimeZoned);
	System.out.println("Flight expected length: " + flightTime);
	System.out.println("Flight arrives there at " + arrivalTimeZoned + " Madrid time.");
	System.out.println("You should phone at " + phoneTimeHere + " Toronto time");
    }

}
