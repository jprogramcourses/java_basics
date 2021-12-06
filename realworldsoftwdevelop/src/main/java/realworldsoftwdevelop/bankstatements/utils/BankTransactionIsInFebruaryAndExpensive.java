package realworldsoftwdevelop.bankstatements.utils;

import java.time.Month;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

public class BankTransactionIsInFebruaryAndExpensive implements IBankTransactionFilter {

    @Override
    public boolean test(final BankTransaction bankTransaction) {

	return bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1000;
    }

}
