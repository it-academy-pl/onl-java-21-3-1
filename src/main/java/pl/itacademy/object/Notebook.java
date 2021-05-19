package pl.itacademy.object;

public class Notebook {
    private String brand;
    private String model;
    private int amountOfMemory;

    public Notebook(String brand, String model, int amountOfMemory) {
        this.brand = brand;
        this.model = model;
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", amountOfMemory=" + amountOfMemory +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook another = (Notebook) obj;
        if (!brand.equals(another.brand)) {
            return false;
        }
        if (!model.equals(another.model)) {
            return false;
        }

        return amountOfMemory == another.amountOfMemory;
    }

    @Override
    public int hashCode() {
        return 15 * amountOfMemory * brand.length() + model.charAt(0);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }
}
