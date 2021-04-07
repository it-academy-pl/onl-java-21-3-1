package pl.itacademy.oop;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;

    public BankAccount() {
        balance = BigDecimal.ZERO;
    }

    public void topUp(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Current balance is: " + balance);
    }

    public void withDraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        System.out.println("Current balance is: " + balance);
    }
}
