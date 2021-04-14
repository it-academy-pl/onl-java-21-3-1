package pl.itacademy.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 42;
        numbers[1] = 420;
        numbers[2] = 4;

        int[] tmp = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            tmp[i] = numbers[i];
        }

        numbers = tmp;
        numbers[3] = -5;
        numbers[4] = -10;

        System.out.println(Arrays.toString(numbers));

        List<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        strings.remove(1);
        System.out.println(strings);
        strings.add("second");
        System.out.println(strings);
        strings.add(1, "hello");
        System.out.println(strings);
        strings.add(0, "zero");
        System.out.println(strings);
        System.out.println(strings.contains("Java"));
        System.out.println(strings.contains("hello"));
        strings.set(0, "WORLD");
        System.out.println(strings);
        System.out.println(strings.get(4));
        strings.clear();
        System.out.println(strings);


        List<Integer> integers = List.of(42, 43, -1, -5, 0);
//        integers = Arrays.asList(2, 3, 4, 5);
        System.out.println(integers);
    }
}
