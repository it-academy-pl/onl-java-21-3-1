package pl.itacademy.keywords;

public class FinalDemo {
    public static void main(String[] args) {
        byte b = 12;
        b++;
        b = 15;

        final byte n = 12;
        //Once created final variable can not be re-assigned
        //n = 15;
    }
}
