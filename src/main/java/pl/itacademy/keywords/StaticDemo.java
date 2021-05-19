package pl.itacademy.keywords;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(Notebook.getNumberOfCreatedNotebooks());

        Notebook apple = new Notebook("Air", "intel", 13);
        Notebook dell = new Notebook("ABC", "amd", 15);
        Notebook lenovo = new Notebook("ideapad", "intel", 17);

        System.out.println(apple.getModel());
        System.out.println(dell.getProcessorName());
        System.out.println(lenovo.getMonitorDiagonal());

        System.out.println(apple.getNumberOfCreatedNotebooks());
        System.out.println(dell.getNumberOfCreatedNotebooks());
        System.out.println(lenovo.getNumberOfCreatedNotebooks());

        System.out.println(Notebook.getNumberOfCreatedNotebooks());
    }
}
