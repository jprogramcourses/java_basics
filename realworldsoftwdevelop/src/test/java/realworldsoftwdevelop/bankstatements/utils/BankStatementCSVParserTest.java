package realworldsoftwdevelop.bankstatements.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankStatementCSVParserTest {

    private final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

    @Test
    void shouldParseOneCorrectLine() {
	final String line = "01-01-2021,1200,Salary";

	final BankTransaction result = bankStatementCSVParser.parseBankTransaction(line);

	final BankTransaction expected = new BankTransaction(LocalDate.of(2021, Month.JANUARY, 01), 1200d, "Salary");

	final double tolerance = 0.0d;

	assertEquals(expected.getDate(), result.getDate());
	assertEquals(expected.getAmount(), result.getAmount());
	assertEquals(expected.getDescription(), result.getDescription());
    }

    @Test
    void shouldNotParseLineNullTest() {
	final String line = null;

	final BankTransaction result = bankStatementCSVParser.parseBankTransaction(line);
	assertNull(result);
    }

    @Test
    void parseLinesFromCSVTest() {
	final String line1 = "01-01-2021,1200,Salary";
	final String line2 = "02-01-2021,1201,Salary";
	final String line3 = "03-01-2021,1202,Salary";
	final String line4 = "04-01-2021,1203,Salary";
	final String[] linesArray = { line1, line2, line3, line4 };

	final List<BankTransaction> listTransactions = bankStatementCSVParser
		.parseLinesFromCSV(Arrays.asList(linesArray));

	assertEquals(linesArray.length, listTransactions.size());

    }

}
