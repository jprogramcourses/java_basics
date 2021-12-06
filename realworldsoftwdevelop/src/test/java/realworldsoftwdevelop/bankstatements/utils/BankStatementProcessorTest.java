package realworldsoftwdevelop.bankstatements.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

class BankStatementProcessorTest {

    @Test
    void testCalculateTotalAmount() {
	fail("Not yet implemented");
    }

    @Test
    void testCalculateTotalInMonth() {
	fail("Not yet implemented");
    }

    @Test
    void testCalculateTotalForCategory() {
	fail("Not yet implemented");
    }

    @Test
    void testCalculateMaxInDateRange() {

	BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(createListBankTransactions());
	LocalDate init = LocalDate.parse("2021-08-01");
	LocalDate end = LocalDate.parse("2021-08-15");
	BankTransaction bankTransaction = bankStatementProcessor.calculateMaxInDateRange(init, end);
	assertEquals(600d, bankTransaction.getAmount());
    }

    @Test
    void findTransactionsTest() {
	BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(createListBankTransactions());
	List<BankTransaction> listTransactionsResult = bankStatementProcessor
		.findTransactions(new BankTransactionIsInFebruaryAndExpensive());
	listTransactionsResult.stream()
		.forEach(bt -> System.out.printf("Descripcion: %s%nAmount: %f%n", bt.getDescription(), bt.getAmount()));
    }

//    @Test
    void testHistogramExpensesByMonthAndDescription() {
	BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(createListBankTransactions());

    }

    private List<BankTransaction> createListBankTransactions() {

	BankTransaction bt1 = new BankTransaction(LocalDate.parse("2021-08-02"), 500d, "BankTransaction1");
	BankTransaction bt2 = new BankTransaction(LocalDate.parse("2021-08-05"), 600d, "BankTransaction2");
	BankTransaction bt3 = new BankTransaction(LocalDate.parse("2021-09-01"), 200d, "BankTransaction3");
	BankTransaction bt4 = new BankTransaction(LocalDate.parse("2021-03-01"), 25d, "BankTransaction4");
	BankTransaction bt5 = new BankTransaction(LocalDate.parse("2021-02-01"), 2000d, "BankTransaction5");
	BankTransaction bt6 = new BankTransaction(LocalDate.parse("2021-02-14"), 1200d, "BankTransaction6");
	BankTransaction bt7 = new BankTransaction(LocalDate.parse("2021-02-16"), 25d, "BankTransaction7");

	List<BankTransaction> newBankTransactionList = new ArrayList<>();
	newBankTransactionList.add(bt1);
	newBankTransactionList.add(bt2);
	newBankTransactionList.add(bt3);
	newBankTransactionList.add(bt4);
	newBankTransactionList.add(bt5);
	newBankTransactionList.add(bt6);
	newBankTransactionList.add(bt7);

	return newBankTransactionList;
    }

}
