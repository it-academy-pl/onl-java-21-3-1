package pl.itacademy.object;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + " " + age;
    }

    @Override
    protected void finalize() {
        System.out.printf("Person %s object been collected by Garbage Collector%n", this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
