package pl.itacademy.objects;

public class House {
    private String roofColour;
    private int numberOfRooms;
    private int numberOfEntrances;
    private int temperatureInside;

    public House(String roofColour, int numberOfRooms, int numberOfEntrances) {
        this.roofColour = roofColour;
        this.numberOfRooms = numberOfRooms;
        this.numberOfEntrances = numberOfEntrances;
        temperatureInside = 20;
    }

    public String getRoofColour() {
        return roofColour;
    }

    public int getTemperatureInside() {
        return temperatureInside;
    }

    public void increaseTemperatureBy(int degrees) {
        System.out.printf("Increasing temperature by %d degrees!%n", degrees);
        temperatureInside = temperatureInside + degrees;
    }

    public void decreaseTemperatureBy(int degrees) {
        System.out.printf("Decreasing temperature by %d degrees!%n", degrees);
        temperatureInside = temperatureInside - degrees;
    }

    public void setNumberOfEntrances(int numberOfEntrances) {
        this.numberOfEntrances = numberOfEntrances;
    }

    public int getNumberOfEntrances() {
        return numberOfEntrances;
    }
}
