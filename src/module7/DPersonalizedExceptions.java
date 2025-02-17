package module7;

public class DPersonalizedExceptions {
}

// Excepciones personalizadas
class InvalidAgeExpception extends Exception {
    public InvalidAgeExpception() {
        super("Invalid Age.");
    }

    public InvalidAgeExpception(String message) {
        super(message);
    }
}
