package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isBetween = checkIfItsBetween(password);
        boolean consists = checkIfConsists(password);
        boolean hasTwoDigits = checkIfHaveTwoDigits(password);

        if (isBetween && consists && hasTwoDigits) {
            System.out.println("Password is valid");

        }

        if (!isBetween) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!consists) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean checkIfItsBetween(String password) {
        return password.length() >= 6 && password.length() <= 10;

    }

    private static boolean checkIfConsists(String password) {

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfHaveTwoDigits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                counter++;
            }

        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }
}
