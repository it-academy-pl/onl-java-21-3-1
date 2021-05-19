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

        System.out.println("============LAPTOPS============");
        Notebook dell = new Notebook("Dell", "Inspire", 8);
        Notebook hp = new Notebook("HP", "Pro", 8);

        Notebook third = dell;

        System.out.println(dell == hp);
        System.out.println(third == hp);
        System.out.println(third == dell);

        Notebook dell2 = new Notebook("Dell", "Inspire", 8);
        System.out.println(dell == dell2);
        System.out.println(dell.equals(dell2));
        System.out.println(dell.equals(hp));
        System.out.println(dell.equals(dell));
        System.out.println(dell.equals(null));
        System.out.println(dell.hashCode());
        System.out.println(hp.hashCode());
        System.out.println(dell2.hashCode());
    }

    /*
    Method equals() rules:
    - reflexive: A.equals(A) is always true
    - symetric: IF A.equals(B) is true THAN B.equals(A) also true
                IF A.equals(B) is false THAN B.equals(A) also false
    - transitive: IF A.equals(B) is true AND B.equals(C) is true THAN A.equals(C) is also true
    - consistent: the same result even if we execute it unlimited times
    - compare with null is always false


     */
}
