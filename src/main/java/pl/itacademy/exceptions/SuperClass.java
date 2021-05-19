package pl.itacademy.exceptions;

import java.io.IOException;

public class SuperClass {
    void superMethod() throws IOException {
        throw new IOException();
    }
}
