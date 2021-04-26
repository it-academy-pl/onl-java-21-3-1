package pl.itacademy.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        System.out.print("Write file name: ");
        Scanner s = new Scanner(System.in);
        String fileName = s.nextLine();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File not found: %s%n", e.getMessage());
        } finally {
            System.out.println("Cleaning up resources");
            if (fileReader != null) {
                fileReader.close();
            }
        }

        System.out.println("Application has been survived if you can read this.");
    }
}
