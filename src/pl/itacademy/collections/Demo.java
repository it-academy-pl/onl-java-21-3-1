package pl.itacademy.collections;

import java.util.*;

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


        List<Integer> integers = List.of(42, 43, -1, -5, 0, 42);
//        integers = Arrays.asList(2, 3, 4, 5);
        System.out.println(integers);

        Set<Integer> integerSet = Set.of(42, 43, -1, -5, 0);
        System.out.println(integerSet);
        Set<Integer> hashSetOfIntegers = new HashSet<>();
        hashSetOfIntegers.add(42);
        hashSetOfIntegers.add(43);
        hashSetOfIntegers.add(-1);
        hashSetOfIntegers.add(-5);
        hashSetOfIntegers.add(0);
        hashSetOfIntegers.add(42);
        hashSetOfIntegers.add(42);
        System.out.println(hashSetOfIntegers);

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("First");
        stringSet.add("Second");
        stringSet.add("Third");
        stringSet.add("Fourth");
        stringSet.add("Fifth");
        stringSet.add("Java");
        stringSet.add("Hello");
        stringSet.add("World");
        System.out.println(stringSet);

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("budynek", "house");
        dictionary.put("kot", "cat");
        dictionary.put("rower", "bicycle");

        System.out.println(dictionary.get("kot"));
        dictionary.put("kot", "pussy cat");
        System.out.println(dictionary.get("kot"));

        System.out.println(dictionary);

        Map<String, String> orderedDictionary = new TreeMap<>(dictionary);
        System.out.println(orderedDictionary);

        System.out.println(orderedDictionary.keySet());
        System.out.println(orderedDictionary.values());
    }
}
