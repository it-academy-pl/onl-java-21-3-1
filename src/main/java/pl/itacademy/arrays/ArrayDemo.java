package pl.itacademy.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Hello Intellij IDEA");
        System.out.print("Hello again :)");
        System.out.print("Hello JAVA :)");

        int a = 5;
        long b = 42L;
        char character = 'Z';
        boolean isNiceWeatherToday = true;
        String text = "Java is amazing!";

        int[] numbers = new int[5];
        numbers[0] = 7;
        numbers[1] = 13;
        numbers[2] = 17;
        numbers[3] = 19;
        numbers[4] = 29;

        a = numbers[3];
        System.out.println(a);

        System.out.println(numbers[0]);

        short shortNumbers[] = {5, -3, 0, 22};
        System.out.println(shortNumbers[3]);

        String[][] textTable = new String[3][4];
        textTable[0][0] = ":-)";
        textTable[0][1] = ":-(";
        textTable[0][2] = ":-O";
        textTable[0][3] = ">:-(";
        textTable[1][0] = ":-*";

        System.out.println(textTable[1][0]);

        char[][] letters = {{'A', 'B', 'C'}, {'$', '#', '%'}, {'1', '5'}};
        System.out.println(letters[2][1]);
        System.out.println(letters);

        for (int i = 0; i < letters.length; i++) {
            char[] letter = letters[i];
            for (int j = 0; j < letter.length; j++) {
                char c = letter[j];
                System.out.print(c + " ");
            }
        }
        System.out.println();

        for (char[] letter : letters) {
            System.out.println(Arrays.toString(letter));
        }

        System.out.println("Length of outer array: " + letters.length);
        System.out.println("Length of last sub-array is: " + letters[2].length);
    }
}
