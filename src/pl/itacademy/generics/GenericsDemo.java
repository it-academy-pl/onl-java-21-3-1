package pl.itacademy.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
//        numbers.add("four");

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        int result = numbers.get(0) + 1;
        result = numbers.get(1) + 1;
        result = numbers.get(2) + 1;

        Util.printNumbers(numbers);

        Util.addNumbers(numbers, 4, 5, 6);
        System.out.println(numbers);

        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(1.1);
        numbers1.add(1.2);
        numbers1.add(2);

        Util.addNumbers(numbers1, 3, 4, 5);
        System.out.println(numbers1);

        List<Object> objects = new ArrayList<>();
        Util.addNumbers(objects);
    }
}
