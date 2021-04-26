package pl.itacademy.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(toUpperCase("Java"));
            System.out.println(toUpperCase(""));
            System.out.println(toUpperCase("Kawa"));
        } catch (EmptyStringException e) {
            System.out.printf("Unexpected exception has been thrown with message: %s%n", e.getMessage());
        }

        System.out.println("If you see this text - application still survive :)");
    }

    private static String toUpperCase(String text) throws EmptyStringException {
        if (text == null || text.length() == 0) {
            throw new EmptyStringException("Text can't be empty!");
        }
        return text.toUpperCase();
    }
}
