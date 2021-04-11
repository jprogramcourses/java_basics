package realworldsoftwdevelop.bankstatements.utils;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import junit.framework.Assert;
import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankStatementCSVParserTest {
	
	private final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

	@Test
	public void shouldParseOneCorrectLine() {
		final String line = "01-01-2021,1200,Salary";
		
		final BankTransaction result = bankStatementCSVParser.parseBankTransaction(line);
		
		final BankTransaction expected = new BankTransaction(LocalDate.of(2021, Month.JANUARY, 01), 1200d, "Salary");
		
		final double tolerance = 0.0d;
		
		Assert.assertEquals(expected.getDate(), result.getDate());
		Assert.assertEquals(expected.getAmount(), result.getAmount());
		Assert.assertEquals(expected.getDescription(), result.getDescription());
	}

}
