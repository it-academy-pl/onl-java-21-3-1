package pl.itacademy.interfaces;

import pl.itacademy.oop.Animal;

public class FlyingFish extends Animal implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void doSomething() {
        System.out.println("Diamond problem has been solved!");
    }

    @Override
    protected void breathe() {

    }

    @Override
    protected void eat(String food) {

    }

    @Override
    protected void makeSound() {
        System.out.println("No sound this time :(");
    }
}
