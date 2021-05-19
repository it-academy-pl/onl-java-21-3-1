package pl.itacademy.collections;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private String name;
    private int height;

    public Animal(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return height == animal.height && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public int compareTo(Animal anotherAnimal) {
        return this.height - anotherAnimal.height;
    }
}
