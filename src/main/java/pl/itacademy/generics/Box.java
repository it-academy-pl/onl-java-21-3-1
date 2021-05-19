package pl.itacademy.generics;

public class Box<I> {
    I item;

    void put(I item) {
        this.item = item;
    }

    I getItem() {
        return item;
    }
}
