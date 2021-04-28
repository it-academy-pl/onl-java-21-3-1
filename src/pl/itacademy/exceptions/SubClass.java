package pl.itacademy.exceptions;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
    @Override
    void superMethod() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
