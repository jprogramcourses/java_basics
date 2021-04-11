package realworldsoftwdevelop.bankstatements.utils;

import java.util.List;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public interface IBankStatementParser {
	
	public BankTransaction parseBankTransaction(final String line);
	
	public List<BankTransaction> parseLinesFromCSV(List<String> lines);

}
