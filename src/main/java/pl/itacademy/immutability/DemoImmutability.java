package pl.itacademy.immutability;

import java.util.HashMap;
import java.util.Map;

public class DemoImmutability {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.setSecurityManager(new SecurityManager());

        Address krakow = new Address("Kraków", "29 Listopada", 11);
        Address wroclaw = new Address("Wrocław", "Niepodległości", 42);
        Address warszawa = new Address("Warszawa", "Jana Pawła II", 22);

        Person kowalski = Person.createPerson("Jan", "Kowalski", krakow);
        Person nowak = Person.createPerson("Ola", "Nowak", wroclaw);
        Person lewandowski = Person.createPerson("Robert", "Lewandowski", warszawa);

        Map<Person, String> favoriteBeer = new HashMap<>();
        favoriteBeer.put(kowalski, "Żywiec");
        favoriteBeer.put(nowak, "Tyskie");
        favoriteBeer.put(lewandowski, "Bezalkoholowe");

        System.out.println(favoriteBeer);

        System.out.printf("Jan's favorite beer is: %s.%n", favoriteBeer.get(kowalski));
        System.out.printf("Ola's favorite beer is: %s.%n", favoriteBeer.get(nowak));

        System.out.printf("Ola's hashCode BEFORE changing properties: %d.%n", nowak.hashCode());
//        nowak.setLastName("Nowak-Kowalski");
//        System.out.printf("Ola's hashCode AFTER changing last name: %d.%n", nowak.hashCode());
        System.out.println(favoriteBeer);
        System.out.printf("Ola's favorite beer is: %s.%n", favoriteBeer.get(nowak));

        Address olaAddress = nowak.getAddress();
        olaAddress.setCity("Kraków");
        olaAddress.setStreet("29 Listopada");
        olaAddress.setBuildingNumber(11);
        System.out.println(favoriteBeer);
        System.out.printf("Ola's favorite beer is: %s.%n", favoriteBeer.get(nowak));
        System.out.printf("Ola's hashCode AFTER changing address: %d.%n", nowak.hashCode());

        wroclaw.setBuildingNumber(142);
        System.out.println(favoriteBeer);
        System.out.printf("Ola's favorite beer is: %s.%n", favoriteBeer.get(nowak));
        System.out.printf("Ola's hashCode AFTER changing address: %d.%n", nowak.hashCode());

//        Class<? extends Person> nowakClass = nowak.getClass();
//        Field addressField = nowakClass.getDeclaredField("address");
//        addressField.setAccessible(true);
//        Address address = (Address) addressField.get(nowak);
//        address.setBuildingNumber(123);

        System.out.println(favoriteBeer);
        System.out.printf("Ola's favorite beer is: %s.%n", favoriteBeer.get(nowak));
        System.out.printf("Ola's hashCode AFTER changing address: %d.%n", nowak.hashCode());

//        Student aga = new Student("Aga", "Duda", krakow, "Jagielonski Uniwersytet");
//        favoriteBeer.put(aga, "lagger");
//        System.out.println(favoriteBeer);
//        System.out.printf("Aga's favorite beer is: %s.%n", favoriteBeer.get(aga));
//        System.out.printf("Aga's hashCode AFTER changing address: %d.%n", aga.hashCode());
//
//        aga.setUniversityName("AWF");
//        System.out.println(favoriteBeer);
//        System.out.printf("Aga's favorite beer is: %s.%n", favoriteBeer.get(aga));
//        System.out.printf("Aga's hashCode AFTER changing address: %d.%n", aga.hashCode());
    }
}
