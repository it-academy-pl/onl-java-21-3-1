package pl.itacademy.interfaces;

@FunctionalInterface
public interface Flyable {
    void fly();

    public default void doSomething() {
        System.out.println("We are doing something default here as Flyable instance.");
    }
}
