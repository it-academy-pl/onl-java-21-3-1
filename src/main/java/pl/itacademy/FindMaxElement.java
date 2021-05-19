package pl.itacademy;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = {12, 31, 52, -10, 13, 7, 21, 71};
        var max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.printf("Maximum number is: %d%n", max);
    }
}
