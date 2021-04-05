package pl.itacademy.oop;

public class Dog extends Animal {

    @Override
    protected void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    protected void eat(String food) {
        System.out.printf("Dog is eating %s.%n", food);
    }

    @Override
    protected void sleep() {
        System.out.println("Dog is sleeping");
    }
}
