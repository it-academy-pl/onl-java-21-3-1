package pl.itacademy.loop;

import java.util.concurrent.ThreadLocalRandom;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("+++++++++++++");
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("+++++++++++++");
        for (int i = 0; i > -5; i--) {
            System.out.println(i);
        }

        String[] myFriends = {"Andrzej", "Wojtek", "Kuba", "Ola", "Aga", "Jan"};
        for (int i = 0; i < myFriends.length; i++) {
            String friend = myFriends[i];
            System.out.printf("%s is my good friend!%n", friend);
        }

        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (String friend : myFriends) {
            System.out.printf("%s is one of my the best friends!%n", friend);
            if (random.nextInt(10) > 5) {
                break;
            }
        }

        for (int i = myFriends.length - 1; i >= 0; i = i - 2) {
            String friend = myFriends[i];
            System.out.printf("%s is my good friend!%n", friend);
        }

        System.out.println("+++++++++++++++++++++++");

        for (int i = 0; i < 10; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
