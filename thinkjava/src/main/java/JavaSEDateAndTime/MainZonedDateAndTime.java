package JavaSEDateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainZonedDateAndTime {

	public static void main(String[] args) {
		
		ZoneId london = ZoneId.of("Europe/London");
		ZoneId la = ZoneId.of("America/Los_Angeles");
		
		LocalDateTime myTime = LocalDateTime.now();
		ZonedDateTime londonTime = ZonedDateTime.of(myTime, london);
		ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
		System.out.println("My time: " + myTime);
		System.out.println("London time: " + londonTime);
		System.out.println("Los Angeles time: " + laTime);
		
		// Set Timezone
		ZoneId.of("GMT+2");
		ZoneId.of("UTC-05:00");
		ZoneId.systemDefault();

	}

}
