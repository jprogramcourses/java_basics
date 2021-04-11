package realworldsoftwdevelop.bankstatements;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import realworldsoftwdevelop.bankstatements.utils.BankStatementCSVParser;
import realworldsoftwdevelop.bankstatements.utils.IBankStatementParser;

public class MainBankApplication {
	

	public static void main(String[] args) throws IOException {
		
		final BankTransactionalAnalyzerSimple bankTransactional = new BankTransactionalAnalyzerSimple();

		final IBankStatementParser bankStatementParser = new BankStatementCSVParser();

		bankTransactional.analyze(args[0], bankStatementParser);

	}

}
