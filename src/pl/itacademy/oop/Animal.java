package pl.itacademy.oop;

public abstract class Animal {
    protected String name;

    protected abstract void breathe();
    protected abstract void eat(String food);

    protected void sleep() {
        System.out.println("Animal is sleeping");
    }
}
