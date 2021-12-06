package realworldsoftwdevelop.bankstatements.utils;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

@FunctionalInterface
public interface IBankTransactionFilter {

    boolean test(BankTransaction bankTransaction);

}
