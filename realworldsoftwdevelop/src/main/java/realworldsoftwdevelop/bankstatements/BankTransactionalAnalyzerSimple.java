package realworldsoftwdevelop.bankstatements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;
import realworldsoftwdevelop.bankstatements.utils.BankStatementCSVParser;
import realworldsoftwdevelop.bankstatements.utils.BankStatementProcessor;
import realworldsoftwdevelop.bankstatements.utils.IBankStatementParser;

public class BankTransactionalAnalyzerSimple {

	private static final String RESOURCES = "src/main/resources/";

	public void analyze(final String fileName, final IBankStatementParser bankStatementParser) throws IOException {
		
		final Path path = Paths.get(RESOURCES + fileName);
		
		if (Files.exists(path)) {
			final List<String> lines = Files.readAllLines(path);

			final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);
			final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
			
//			final Double[] total = new Double[12];
//			Arrays.fill(total, 0.0);

			collectSummary(bankStatementProcessor);

		} else {
			System.out.println("No ha indicado un fichero correcto");
		}
	}

	private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
		System.out.println("The total amount is: " + bankStatementProcessor.calculateTotalAmount());
		System.out.println(
				"The total amount of the month is " + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
		System.out
				.println("The total salary received is " + bankStatementProcessor.calculateTotalForCategory("Amazon"));
	}

}
