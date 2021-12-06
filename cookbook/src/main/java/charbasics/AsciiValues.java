package charbasics;

import java.nio.charset.Charset;

public class AsciiValues {

    public static String bytesToString(byte[] bytes) {
	return new String(bytes, Charset.forName("UTF-8"));
    }

    public static String charToBinary(char c) {
	return Integer.toBinaryString(c);
    }

}
