package dates;

import java.time.temporal.Temporal;

import dates.utils.DateUtils;

public class MainDates {

    public static void main(String[] args) {

	Temporal ldTime = DateUtils.currentDateTime("time");
	System.out.println(ldTime);

    }

}
