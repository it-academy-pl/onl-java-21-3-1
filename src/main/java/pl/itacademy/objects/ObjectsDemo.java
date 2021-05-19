package pl.itacademy.objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Object o = new Object();

        ObjectsDemo od = new ObjectsDemo();

        House house = new House("grey", 4, 2);

        System.out.println(house.getRoofColour());
        System.out.println(house.getTemperatureInside());

        house.increaseTemperatureBy(3);

        System.out.println(house.getTemperatureInside());

        house.decreaseTemperatureBy(1);

        System.out.println(house.getTemperatureInside());

        int originalNumber = 5;
        int difference = 3;
        int result = increaseNumberBy(originalNumber, difference);
        System.out.println(result);
        System.out.println(originalNumber);

        Bike bike = new Bike();

        house.setNumberOfEntrances(3);

        System.out.println(house.getNumberOfEntrances());

    }

    private static int increaseNumberBy(int number, int difference) {
        number = number + difference;
        return number;
    }
}
