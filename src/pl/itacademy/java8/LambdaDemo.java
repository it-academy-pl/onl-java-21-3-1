package pl.itacademy.java8;

import pl.itacademy.oop.Cat;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        String test = "Hello Lambda!";

        TextVerifier textVerifier = new TextLengthLessThan10CharactersVerifier();
        System.out.println(checkTextWithVerifier(test, textVerifier));

        TextVerifier lessThan10Chars = new TextVerifier() {
            @Override
            public boolean verifyText(String text) {
                return text.length() < 10;
            }
        };
        System.out.println(checkTextWithVerifier(test, lessThan10Chars));

        TextVerifier lessThan10CharsLambda = (String text) -> {
            return text.length() < 10;
        };
        System.out.println(checkTextWithVerifier(test, lessThan10CharsLambda));

        TextVerifier lessThan10 = (text) -> {
            return text.length() < 10;
        };
        System.out.println(checkTextWithVerifier(test, lessThan10));

        TextVerifier lessThanTen = (text) -> text.length() < 10;
        System.out.println(checkTextWithVerifier(test, lessThanTen));

        TextVerifier shorterThan10 = text -> text.length() < 10;
        System.out.println(checkTextWithVerifier(test, shorterThan10));

        System.out.printf("Is \"%s\" smaller than 10 chars: %s%n", test, checkTextWithVerifier(test, text -> text.length() < 10));
        System.out.printf("Is \"%s\" longer than 10 chars: %s%n", test, checkTextWithVerifier(test, text -> text.length() > 10));
        System.out.printf("Is \"%s\" contains \"Java\" word: %s%n", test, checkTextWithVerifier(test, text -> text.contains("Java")));
        System.out.printf("Is \"%s\" contains \"Hello\" word: %s%n", test, checkTextWithVerifier(test, t -> t.contains("Hello")));
        System.out.printf("Is \"%s\" contains \"Hello\" word: %s%n", test, checkTextWithPredicate(test, t -> t.contains("Hello")));


        System.out.printf("Is \"%s\" is blank text: %s%n", test, checkTextWithVerifier(test, t -> t.isBlank()));

        test = "   ";
        System.out.printf("Is \"%s\" is blank text: %s%n", test, checkTextWithVerifier(test, t -> t.isBlank()));
        System.out.printf("Is \"%s\" is blank text: %s%n", test, checkTextWithVerifier(test, String::isBlank));
        System.out.printf("Is \"%s\" is blank text: %s%n", test, checkTextWithPredicate(test, String::isBlank));


        Cat createdCat = createCatWithCreator("Thomas", name -> new Cat(name));
        System.out.println(createdCat);

        createdCat = createCatWithCreator("Jasper", Cat::new);
        System.out.println(createdCat);

        createdCat = createCatWithSupplier(() -> new Cat("Tom"));
        System.out.println(createdCat);
    }

    private static boolean checkTextWithVerifier(String text, TextVerifier verifier) {
        return verifier.verifyText(text);
    }

    private static boolean checkTextWithPredicate(String text, Predicate<String> predicate) {
        return predicate.test(text);
    }

    private static Cat createCatWithCreator(String name, CatCreator catCreator) {
        return catCreator.createCat(name);
    }

    private static Cat createCatWithSupplier(Supplier<Cat> catSupplier) {
        return catSupplier.get();
    }

}
