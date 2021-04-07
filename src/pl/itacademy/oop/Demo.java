package pl.itacademy.oop;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Dog spike = new Dog("Spike");
        spike.breathe();
        spike.eat("meat");
        spike.sleep();

        Cat tom = new Cat("Tom");

        listenTo(spike);
        listenTo(tom);

        System.out.println("==============================");
        BankAccount account = new BankAccount();
        account.topUp(BigDecimal.valueOf(100));
        account.topUp(BigDecimal.valueOf(50));

        account.withDraw(BigDecimal.valueOf(75));

//        account.balance = BigDecimal.valueOf(1_000_000);

        account.withDraw(BigDecimal.valueOf(1_000));
    }

    private static void listenTo(Animal animal) {
        animal.makeSound();
    }
}
