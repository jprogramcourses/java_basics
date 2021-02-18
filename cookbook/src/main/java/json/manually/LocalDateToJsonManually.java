package json.manually;

import java.time.LocalDate;

public class LocalDateToJsonManually {
	
	private static final String OPEN = "{";
	private static final String CLOSE = "}";

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(toJson(now));
	}
	
	private static String toJson(LocalDate localDate) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(OPEN).append("\n");
		sb.append(jsonize("year", localDate.getYear()));
		sb.append(jsonize("month", localDate.getMonth()));
		sb.append(jsonize("day", localDate.getDayOfMonth()));
		sb.append(CLOSE).append("\n");
		
		return sb.toString();
	}
	
	private static String jsonize(String key, Object value) {
		return String.format("\"%s\": \"%s\",\n", key, value);
	}

}
