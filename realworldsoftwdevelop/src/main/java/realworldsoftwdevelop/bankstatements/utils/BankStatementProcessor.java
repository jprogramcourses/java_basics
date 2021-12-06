package realworldsoftwdevelop.bankstatements.utils;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankStatementProcessor {

    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
	this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmount() {
	double totalAmount = 0d;
	for (BankTransaction bT : bankTransactions) {
	    totalAmount += bT.getAmount();
	}
	return totalAmount;
    }

//    public List<BankTransaction> findTransactionsGreaterThanEqual(Double amount) {
//	return bankTransactions.stream().filter(bt -> bt.getAmount() >= amount).collect(Collectors.toList());
//    }
//
//    public List<BankTransaction> findTransactionsInMonth(final Month month) {
//	return bankTransactions.stream().filter(bt -> bt.getDate().getMonth().equals(month))
//		.collect(Collectors.toList());
//    }

    public List<BankTransaction> findTransactions(final IBankTransactionFilter bankTransactionFilter) {
	final List<BankTransaction> result = new ArrayList<>();
	return bankTransactions.stream().filter(bt -> bankTransactionFilter.test(bt)).collect(Collectors.toList());
    }

    public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
	return findTransactions(bankTransaction -> bankTransaction.getAmount() >= amount);
    }

    public double summarizeTransactions(final IBankTransactionSummarizer bankTransactionSummarizer) {
	double result = 0;
	for (final BankTransaction bankTransaction : bankTransactions) {
	    result = bankTransactionSummarizer.summarize(result, bankTransaction);
	}
	return result;
    }

    public double calculateTotalInMonth(final Month month) {

	return summarizeTransactions((acc, bankTransaction) -> bankTransaction.getDate().getMonth() == month
		? acc + bankTransaction.getAmount()
		: acc);
    }

    public double calculateTotalForCategory(String category) {
	double totalAmount = 0d;
	for (BankTransaction bt : bankTransactions) {
	    if (bt.getDescription().equals(category)) {
		totalAmount += bt.getAmount();
	    }
	}
	return totalAmount;
    }

    public BankTransaction calculateMaxInDateRange(LocalDate init, LocalDate end) {
	double max = 0;
	BankTransaction maxBankTransaction = retrieveTransactionsInDateRange(init, end).stream().max(maxComparator)
		.orElse(null);
	return maxBankTransaction;
    }

//    public List<String> histogramExpensesByMonthAndDescription() {
//	
//	List<String> histogram = new ArrayList<String>();
//
//	for(BankTransaction bt : bankTransactions) {
//	    YearMonth yearMonth = YearMonth.from(bt.getDate());
//	    for(String s : histogram) {
//		if(s.equals(histogram))
//	    }
//	}
//    }

    private List<BankTransaction> retrieveTransactionsInDateRange(LocalDate init, LocalDate end) {
	return bankTransactions.stream().filter((bt) -> (bt.getDate().isBefore(end) && bt.getDate().isAfter(init)))
		.collect(Collectors.toList());
    }

    Comparator<BankTransaction> maxComparator = new Comparator<BankTransaction>() {

	@Override
	public int compare(BankTransaction o1, BankTransaction o2) {
	    return o1.getAmount().compareTo(o2.getAmount());
	}

    };

}
