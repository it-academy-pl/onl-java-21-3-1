package pl.itacademy.generics;

import java.util.List;

public class Util {
    static <B> boolean compareBoxes(Box<B> one, Box<B> two) {
        return one.getItem().equals(two.getItem());
    }

    static void addNumbers(List<? super Integer> list, Integer... numbers) {
        for (Integer number : numbers) {
            list.add(number);
        }
    }

    static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
