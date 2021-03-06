package realworldsoftwdevelop.bankstatements.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankStatementCSVParser implements IBankStatementParser{
	
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public BankTransaction parseBankTransaction(final String line) {
		if(line != null && !"".equals(line)) {
			final String[] bankArray = line.split(",");
			final LocalDate localDate = LocalDate.parse(bankArray[0], DATE_PATTERN);
			final Double amount = Double.parseDouble(bankArray[1]);
			final String description = bankArray[2];
			return new BankTransaction(localDate, amount, description);
		}
		return null;
	}
	
	public List<BankTransaction> parseLinesFromCSV(List<String> lines) {
		final List<BankTransaction> bankTransactions = new ArrayList<>();
		if(lines != null) {
			for(String line : lines) {
				bankTransactions.add(parseBankTransaction(line));
			}
		}
		return bankTransactions;
	}

}
