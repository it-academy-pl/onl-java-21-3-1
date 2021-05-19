package pl.itacademy;

public class WindowTester {
    public static void main(String[] args) {
        Window okno = new Window("Gray", 100, 150);
        System.out.println(okno);
        System.out.println(okno.getColour());
        okno.setColour("Yellow");
        System.out.println(okno);

        okno.open();
        System.out.println(okno);

        okno.close();
        System.out.println(okno);
    }
}
