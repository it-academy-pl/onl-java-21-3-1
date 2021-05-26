package pl.itacademy.annotation;

public class Child extends Parent {
    @Override
    @SuppressWarnings("all")
    public void doSomething(String a, Integer b) {
        System.out.println("Something from child object");
        System.out.println(a + b);
    }
}
