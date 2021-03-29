package pl.itacademy.primitivewrappers;

public class PrimitiveWrappersDemo {
    public static void main(String[] args) {
        int a = 42;
        Integer i = 42;

        int b = 51;
        if (a != b) {
            System.out.println("42 != 51");
        }

        Integer j = 1000;
        Integer z = 1000;
        if (j.equals(z)) {
            System.out.println("Integer 1000 = to another Integer 1000");
        }

        z = j;
        if(z == j) {
            System.out.println("Integer objects the same!");
        }

        Boolean bool = Boolean.TRUE;
        System.out.println(bool.toString());

        a = a + 1;
        i = i + 1;
        i++;
        --i;
        i--;

        String textNumber = "36.6";
        Double normalHumanTemperature = Double.parseDouble(textNumber);
        System.out.println(normalHumanTemperature);

        Double highHumanTemperature = normalHumanTemperature + 2;
        System.out.println(highHumanTemperature);

        System.out.println(textNumber + 2);

        Integer doNotRepeatAtHome = new Integer(22);
        Integer properWay = 22;
    }
}
