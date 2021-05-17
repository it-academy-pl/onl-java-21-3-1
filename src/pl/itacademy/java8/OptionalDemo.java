package pl.itacademy.java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String lastName;

        String nameByIdFromDatabase = getNameByIdFromDatabase(42);
        if (nameByIdFromDatabase != null) {
            lastName = nameByIdFromDatabase.split(" ")[1];
        } else {
            lastName = "not found error";
        }

        System.out.println(lastName);

        Optional<String> optionalName = getOptionalNameByIdFromDatabase(4);
        if (optionalName.isPresent()) {
            lastName = optionalName.get().split(" ")[1];
        } else {
            lastName = "not found error";
        }

        System.out.println(lastName);

        lastName = getOptionalNameByIdFromDatabase(42)
                .map(result -> result.split(" ")[1])
                .filter(result -> result.contains("K"))
                .filter(result -> result.length() > 2)
                .map(result -> result.substring(0, 2))
                .map(String::toUpperCase)
                .orElseGet(() -> defaultValue());

        System.out.println(lastName);
    }

    private static String getNameByIdFromDatabase(int id) {
        if (id > 5) {
            return "Jan Kowalski";
        }
        return null;
    }

    private static Optional<String> getOptionalNameByIdFromDatabase(int id) {
        if (id > 5) {
            return Optional.of("Jan Kowalski");
        }
        return Optional.empty();
    }

    private static String defaultValue() {
        System.out.println("Default value been provided");
        return "not found error";
    }
}
