package pl.itacademy.bank.internal;

import java.math.BigDecimal;

//TODO: implement the methods
abstract class Account {
    private final String accountNumber;
    private BigDecimal balance;
    private double percents;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = BigDecimal.ZERO;
    }

    abstract void recalculatePercents();

    void topUp(BigDecimal amount) {

    }

    BigDecimal withDraw(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
