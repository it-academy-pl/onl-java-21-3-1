package pl.itacademy.generics;

import pl.itacademy.oop.Animal;

public class AnimalBox<A extends Animal> {
    A item;

    void put(A item) {
        this.item = item;
    }

    A getItem() {
        return item;
    }
}
