package pl.itacademy.java8;

public class NestedClassDemo {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void doSomething() {
                System.out.println("Hello from Anonymous class!");
            }
        };

        abstractClass.doSomething();

        AbstractClass ac = new SpecificClass();
        ac.doSomething();
    }

    public static class NestedClass {

    }
}
