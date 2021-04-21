package pl.itacademy;

public class Window {
    private String colour;
    private int height;
    private int weight;
    private boolean opened;

    public Window(String colour, int height, int weight) {
        this.colour = colour;
        this.height = height;
        this.weight = weight;
        this.opened = false;
    }

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Window{" +
                "colour='" + colour + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", opened=" + opened +
                '}';
    }
}
