package pl.itacademy.oop;

public abstract class Animal {
    protected String name;

    protected abstract void breathe();
    protected abstract void eat(String food);
    protected abstract void makeSound();

    public Animal(String name) {
        System.out.println("Animal initialization");
        this.name = name;
    }

    public Animal() {
        this("no name");
    }

    protected void sleep() {
        System.out.println("Animal is sleeping");
    }
}
