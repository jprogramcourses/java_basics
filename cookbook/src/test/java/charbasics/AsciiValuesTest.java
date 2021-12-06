package charbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class AsciiValuesTest {

    @BeforeClass
    public void beforeAll() {
	System.out.println("Test Ascii Values Test");
    }

    @Test
    void testBytesToString() {

	byte[] bytes = new byte[10];

	System.out.println(AsciiValues.bytesToString(bytes));
	System.out.println("hola");

	fail("Not yet implemented");
    }

    @Test
    void charToBinaryTest() {
	char c = 'a';
	assertEquals("01100001", AsciiValues.charToBinary(c));
    }

}
