package pl.itacademy.oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Dog initialization");
    }

    @Override
    protected void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    protected void eat(String food) {
        System.out.printf("Dog is eating %s.%n", food);
    }

    @Override
    protected void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    protected void sleep() {
        super.sleep();
        System.out.println("Dog is animal, so it is sleeping too!");
    }

    public String getName() {
        return name;
    }
}
