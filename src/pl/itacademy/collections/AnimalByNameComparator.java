package pl.itacademy.collections;

import java.util.Comparator;

public class AnimalByNameComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal one, Animal another) {
        return one.getName().compareTo(another.getName());
    }
}
