package pl.itacademy;

public class RecursiveCallExample {
    public static void main(String[] args) {
        System.out.printf("Is number %d odd? %s%n", 1, isOddNumber(1));
        System.out.printf("Is number %d odd? %s%n", 2, isOddNumber(2));
        System.out.printf("Is number %d odd? %s%n", 3, isOddNumber(3));
        System.out.printf("Is number %d odd? %s%n", 4, isOddNumber(4));
        System.out.printf("Is number %d odd? %s%n", 5, isOddNumber(5));
        System.out.printf("Is number %d odd? %s%n", 6, isOddNumber(6));
        System.out.printf("Is number %d odd? %s%n", 8, isOddNumber(8));
        System.out.printf("Is number %d odd? %s%n", 9, isOddNumber(9));
        System.out.printf("Is number %d odd? %s%n", 10, isOddNumber(10));
    }

    //do NOT repeat at home, this is not the best way for checking is number odd or not
    //this is just example of recursive call
    private static boolean isOddNumber(int number) {
        if (number == 1) {
            return true;
        }
        return !isOddNumber(number - 1);
    }
}
