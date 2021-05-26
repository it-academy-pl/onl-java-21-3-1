package pl.itacademy.annotation;

public class ClassWithDeprecatedMethod {

    @Deprecated(forRemoval = true, since = "26.05.2021")
    public static void printHello() {
        System.out.println("Hello!");
    }

    public static void print(String word) {
        System.out.println(word);
    }
}
