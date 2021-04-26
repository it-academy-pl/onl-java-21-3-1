package pl.itacademy.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithResourcesExample {
    public static void main(String[] args) throws IOException {
        System.out.print("Write file name: ");
        Scanner s = new Scanner(System.in);
        String fileName = s.nextLine();

        try (FileReader fileReader = new FileReader(fileName)) {
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File not found: %s%n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("File can't be read: %s%n", e.getMessage());
            throw e;
        }

        System.out.println("Application has been survived if you can read this.");
    }
}
