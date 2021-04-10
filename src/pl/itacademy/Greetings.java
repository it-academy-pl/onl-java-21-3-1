package pl.itacademy;

public class Greetings {
    public static void main(String[] args) {
        if(args.length != 0) {
            System.out.printf("Hello, %s!%n", args[0]);
        } else {
            System.out.println("Hello there!");
        }
    }
}
