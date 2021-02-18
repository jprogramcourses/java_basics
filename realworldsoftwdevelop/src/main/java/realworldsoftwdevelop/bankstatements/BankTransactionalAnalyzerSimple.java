package realworldsoftwdevelop.bankstatements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;
import realworldsoftwdevelop.bankstatements.utils.BankStatementCSVParser;

public class BankTransactionalAnalyzerSimple {

	private static final String RESOURCES = "src/main/resources/";
	
	

	public static void main(String[] args) throws IOException {
		
		final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
		
		final Path path = Paths.get(RESOURCES + args[0]);
		if(Files.exists(path)) {
			final List<String> lines = Files.readAllLines(path);
			
			final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);
			final Double[] total = new Double[12];
			Arrays.fill(total, 0.0);
			
			System.out.println("The total amount is: " + calculateTotalAmount(bankTransactions));
			System.out.println("The total amount of the month is " + selectAmountInMonth(bankTransactions, Month.FEBRUARY));
			
		}else {
			System.out.println("No ha indicado un fichero correcto");
		}
		
	}
	
	public static double calculateTotalAmount(final List<BankTransaction> listTransactions) {
		double totalAmount = 0d;
		for(BankTransaction bT : listTransactions) {
			totalAmount += bT.getAmount();
		}
		return totalAmount;
	}
	
	public static double selectAmountInMonth(final List<BankTransaction> listTransactions, Month month) {
		double totalAmountMonth = 0d;
		for(BankTransaction bT : listTransactions) {
			if(bT.getDate().getMonth() == month){
				totalAmountMonth += bT.getAmount();
			}
		}
		return totalAmountMonth;
	}

}
