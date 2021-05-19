package pl.itacademy.enums;

public class EnumDemo {
    public static void main(String[] args) {
        printMonthName(Month.JANUARY);
        printMonthName(Month.FEBRUARY);
        printMonthName(Month.DECEMBER);

        System.out.println(Month.SEPTEMBER.compareTo(Month.MARCH));

        System.out.println(Month.SEPTEMBER.ordinal());

        printMonthName(Month.valueOf("MARCH"));

        for (Month month : Month.values()) {
            System.out.print(month.name() + " ");
        }
        System.out.println();
        System.out.println(Month.JUNE.getDeclaringClass());

        Month month = Month.fromPolishName("Luty");
        printMonthName(month);

        System.out.println(Month.JULY.equals(Month.NOVEMBER));
        System.out.println(Month.NOVEMBER.equals(Month.NOVEMBER));
        System.out.println(Month.OCTOBER == Month.OCTOBER);

        Month october = Month.fromPolishName("Październik");
        System.out.printf("Check if predefined instance is the same as instance from Polish Name: %s%n", october == Month.OCTOBER);

        System.out.println(Month.APRIL);
    }

    private static void printMonthName(Month month) {
        System.out.printf("%s - %s - %d days in this month%n", month.getEnglishName(), month.getPolishName(), month.getDays());
    }
}
