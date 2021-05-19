package pl.itacademy.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparingObjectsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 7, 1, -2, 3, 0, -2, 7));
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        TreeSet<String> strings = new TreeSet<>(List.of("Hello", "World", "world", "java", "First", "Apple", "Zero"));
        System.out.println(strings);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Tiger", 100));
        animalList.add(new Animal("Giraffe", 450));
        animalList.add(new Animal("Mouse", 2));
        animalList.add(new Animal("Dog", 29));

        animalList.sort(Comparator.naturalOrder());
        System.out.println(animalList);

        animalList.sort(Comparator.reverseOrder());
        System.out.println(animalList);

        TreeSet<Animal> animalSet = new TreeSet<>(animalList);
        System.out.println(animalSet);

        animalList.sort(new AnimalByNameComparator());
        System.out.println(animalList);

        TreeSet<Animal> animalTreeSet = new TreeSet<>(Comparator.nullsFirst(new AnimalByNameComparator()));
        animalTreeSet.addAll(animalList);
        animalTreeSet.add(new Animal("Antilope", 190));
        animalTreeSet.add(null);
        System.out.println(animalTreeSet);
    }

    /* Compare rules:
    1. reflexive a.compareTo(a) always should be 0
    2. anitysymetric: if a.compareTo(b) is negative number then b.compareTo(a) is positive number
    3. transitive: if a.compareTo(b) is negative number and b.compareTo(c) is negateive number
       THEN a.compareTo(c) is negative number as well.
     */
}
