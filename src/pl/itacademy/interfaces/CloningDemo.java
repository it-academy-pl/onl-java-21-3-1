package pl.itacademy.interfaces;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        MobilePhone apple = new MobilePhone("Apple", "iphone 12", 1200);

        //DO NOT repeat it at home
        MobilePhone chinaPhone = apple.clone();

        System.out.println(chinaPhone.getBrand());
        System.out.println(chinaPhone.getModel());

        System.out.println("=========================");

        //Proper way of cloning objects - copy constructor
        MobilePhone onePlus = new MobilePhone("One Plus", "One", 3000);
        chinaPhone = MobilePhone.from(onePlus);
        System.out.println(chinaPhone.getBrand());
        System.out.println(chinaPhone.getModel());
    }
}
