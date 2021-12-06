package patterns;

public class PatternsUtils {

    private final String PATTERN_PHONE = "[0-9]{9}";

    public static void checkPatternPhone(String phone) {
	String pattern = "[0-9]{9}";

	if (phone.matches(pattern)) {
	    System.out.println(phone + " matches \"" + pattern + "\"");
	} else {
	    System.out.println("NO MATCH");
	}
//	return false;
    }

}
