package pl.itacademy.exceptions;

public class TryWithoutCatchExample {
    public static void main(String[] args) throws Exception {
        try {
            throwUncheckedException();
        } finally {
            System.out.println("finally section");
        }

        try {
            throwException();
        } finally {
            System.out.println("another finally section");
        }
    }

    private static void throwException() throws Exception {
        throw new Exception();
    }

    private static void throwUncheckedException() {
        throw new RuntimeException();
    }
}
