package realworldsoftwdevelop.bankstatements.utils;

import realworldsoftwdevelop.bankstatements.entity.BankTransaction;

@FunctionalInterface
public interface IBankTransactionSummarizer {

    double summarize(double accumulator, BankTransaction bankTransaction);

}
