package pl.itacademy.java8;


import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new Cat("Tom", 3), new Cat("Jasper", 5), new Cat("Jessey", 2));

        List<Integer> nameLengths = cats.stream()
                .filter(cat -> cat.getAge() > 2)
                .map(cat -> cat.getName())
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(nameLengths);

        String foundCatName = cats.stream()
                .filter(cat -> cat.getName().contains("e"))
                .filter(cat -> cat.getAge() < 5)
                .findAny()
                .map(cat -> cat.getName())
                .map(name -> name.toUpperCase())
                .orElseGet(() -> "No cat's been found");

        System.out.println(foundCatName);

    }
}
