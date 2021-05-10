package pl.itacademy.enums;

public class WithoutEnumDemo {
    private static final int JANUARY_NUMBER = 1;
    private static final int FEBRUARY_NUMBER = 2;
    private static final int MARCH_NUMBER = 3;

    public static void main(String[] args) {
        printMonthName(1);
        printMonthName(3);

        printMonthName(FEBRUARY_NUMBER);

        printMonthName(42);
    }

    private static void printMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
        }
    }
}
