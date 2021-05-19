package pl.itacademy.generics;

import java.util.ArrayList;
import java.util.List;

public class BeforeGenericsDemo {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add("four");

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        int result = (Integer) numbers.get(0) + 1;
        System.out.println(result);

        result = (Integer) numbers.get(1) + 1;
        System.out.println(result);

        result = (Integer) numbers.get(2) + 1;
        System.out.println(result);

        result = (Integer) numbers.get(3) + 1;
        System.out.println(result);
    }
}
