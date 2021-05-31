package pl.itacademy.tests;

public class Util {
    public static int add(Integer a, Integer b) {
        if (a == null) {
            throw new IllegalArgumentException("Arguments can't be null!");
        }
        return a + b;
    }
}
