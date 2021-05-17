package pl.itacademy.java8;

import java.util.List;
import java.util.Locale;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");
        for (String string : strings) {
            System.out.println(string.toUpperCase(Locale.ROOT));
        }

        System.out.println("==================================");

        strings.forEach(text -> System.out.println(text.toUpperCase()));
        strings.forEach(text -> System.out.println(text.length()));
    }
}
