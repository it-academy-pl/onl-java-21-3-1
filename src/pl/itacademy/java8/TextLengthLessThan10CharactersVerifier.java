package pl.itacademy.java8;

public class TextLengthLessThan10CharactersVerifier implements TextVerifier {
    @Override
    public boolean verifyText(String text) {
        return text.length() < 10;
    }
}
