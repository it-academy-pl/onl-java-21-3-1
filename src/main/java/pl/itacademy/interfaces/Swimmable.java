package pl.itacademy.interfaces;

import java.util.concurrent.ThreadLocalRandom;

public interface Swimmable {
    public static final int NUMBER = 42;

    public abstract void swim();

    //FROM JAVA 8
    public static int getAnswerToAllTheQuestions() {
        return random();
    }

    public default void doSomething() {
        System.out.println("We are doing something default here as Swimmable instance.");
    }

    //FROM JAVA 9!
    private static int random() {
        return ThreadLocalRandom.current().nextInt();
    }

    private void doSomethingDifferent() {
        System.out.println("We are doing something different here.");
    }
}
