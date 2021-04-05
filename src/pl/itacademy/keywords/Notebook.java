package pl.itacademy.keywords;

public class Notebook {
    private static int numberOfCreatedNotebooks = 0;

    private String model;
    private String processorName;
    private int monitorDiagonal;

    public Notebook(String model, String processorName, int monitorDiagonal) {
        this.model = model;
        this.processorName = processorName;
        this.monitorDiagonal = monitorDiagonal;

        numberOfCreatedNotebooks++;
    }

    public static int getNumberOfCreatedNotebooks() {
        return numberOfCreatedNotebooks;
    }

    public String getModel() {
        return model;
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getMonitorDiagonal() {
        return monitorDiagonal;
    }
}
