package pl.itacademy.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski", 42);
        System.out.println("Person's name: " + kowalski.getFirstName());
        System.out.println("Person's last name: " + kowalski.getLastName());

        System.out.println(kowalski);

        Person nowak = new Person("Ola", "Nowak", 31);
        System.out.println(nowak);

//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
        for (int i = 0; i < 10_000; i++) {
            Person p = new Person(String.valueOf(i), String.valueOf(i), i);
        }

        System.out.println(nowak.getClass());
        System.out.println(nowak.hashCode());
    }
}
