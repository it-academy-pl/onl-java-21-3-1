package pl.itacademy.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:/ProgramFiles/topSecretPasswords.txt");

        occupyHugeAmountOfMemory();
        recursiveCall(0);
        int a = Integer.parseInt("5");
        System.out.println(a);
        int b = Integer.parseInt("5.5");
        System.out.println(b);

        System.out.println(getTextLength("Text"));
        System.out.println(getTextLength("Hello World!"));
        System.out.println(getTextLength(null));
        System.out.println(getTextLength("Hello Java World!"));
    }

    private static int getTextLength(String text) {
        return text.length();
    }

    private static void occupyHugeAmountOfMemory() {
        Object[] array = new Object[Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Object();
        }
    }

    private static void recursiveCall(int counter) {
        System.out.printf("Run method %d%n", counter);
        recursiveCall(++counter);
    }
}
