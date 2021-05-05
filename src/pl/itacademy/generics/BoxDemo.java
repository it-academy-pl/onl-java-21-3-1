package pl.itacademy.generics;

import pl.itacademy.interfaces.FlyingFish;
import pl.itacademy.oop.Cat;
import pl.itacademy.oop.Dog;

public class BoxDemo {
    public static void main(String[] args) {
        Box objectBox = new Box();
        objectBox.put(new Object());
        System.out.println(objectBox.getItem());

        objectBox.put("Hello Generics");
        System.out.println(objectBox.getItem());

        objectBox.put(42);
        System.out.println((Integer) objectBox.getItem() + 1);

        Box<Cat> schrodingersBox = new Box<>();
        schrodingersBox.put(new Cat("Thomas"));
        System.out.println(schrodingersBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.put(7);

        Box<Integer> anotherIntegerBox = new Box<>();
        anotherIntegerBox.put(7);

        AnimalBox<Dog> dogBox = new AnimalBox<>();
        AnimalBox<FlyingFish> flyingFishAnimalBox = new AnimalBox<>();


        boolean result = Util.compareBoxes(integerBox, anotherIntegerBox);
        System.out.println(result);
    }
}
