package module7;

public class FExceptionChain {
    public static void execute() {
        try {
            verificarEdad(-1);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificarEdad(int edad) throws UserException {
        if(edad < 0) {
            throw new UserException(new InvalidAgeExpceptionV2("Edad no valida"));
        }
    }
}

// De esta forma podemos en cadenar excepciones envolviendo
// un excepción con otra.
class UserException extends Exception {
    public UserException(Exception e) {
        super(e);
    }
}

// Excepciones personalizadas
class InvalidAgeExpceptionV2 extends Exception {
    public InvalidAgeExpceptionV2() {
        super("Invalid Age.");
    }

    public InvalidAgeExpceptionV2(String message) {
        super(message);
    }
}
