package pl.itacademy.annotation;

@ItAcademyStuff(42)
public class Parent {
    @ItAcademyStuff(value = 7, online = false)
    public void doSomething(String a, Integer b) {
        System.out.println("Something from parent object");
    }
}
