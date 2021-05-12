package pl.itacademy.oop;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    protected void breathe() {
        System.out.printf("Cat %s is breathing%n", name);
    }

    @Override
    protected void eat(String food) {
        System.out.printf("Cat %s is eating %s%n", name, food);
    }

    @Override
    protected void makeSound() {
        System.out.println("Meu!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} ";
    }
}
