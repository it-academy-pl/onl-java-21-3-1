package pl.itacademy.interfaces;

public class MobilePhone implements Cloneable {
    private final String brand;
    private final String model;
    private final int batteryCapacity;

    public MobilePhone(String brand, String model, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    public static MobilePhone from(MobilePhone another) {
        return new MobilePhone(another.brand, another.model, another.batteryCapacity);
    }

    @Override
    public MobilePhone clone() throws CloneNotSupportedException {
        return (MobilePhone) super.clone();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
