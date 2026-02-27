class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Sw7B {
    
    static void checkPassword(String password) throws PasswordException {
        if (!password.equals("zta99")) {
            throw new PasswordException("Wrong password");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("zta99"); 
        } catch (PasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
