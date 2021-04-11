package realworldsoftwdevelop.bankstatements.utils;

import java.time.Month;
import java.util.List;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankStatementProcessor {
	
	private final List<BankTransaction> bankTransactions;
	
	public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}

	public double calculateTotalAmount() {
		double totalAmount = 0d;
		for(BankTransaction bT : bankTransactions) {
			totalAmount += bT.getAmount();
		}
		return totalAmount;
	}
	
	public double calculateTotalInMonth(Month month) {
		double totalAmount = 0d;
		for(BankTransaction bT : bankTransactions) {
			if(bT.getDate().getMonth() == month){
				totalAmount += bT.getAmount();
			}
		}
		return totalAmount;
	}
	
	public double calculateTotalForCategory(String category) {
		double totalAmount = 0d;
		for(BankTransaction bt : bankTransactions) {
			if(bt.getDescription().equals(category)) {
				totalAmount += bt.getAmount();
			}
		}
		return totalAmount;
	}
	
}
