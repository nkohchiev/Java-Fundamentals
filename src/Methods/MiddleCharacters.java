package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.print(getMiddleChar (input));
    }

    private static String getMiddleChar(String input) {
        int position;
        int length;
        if (input.length() % 2 == 0)
        {
            position = input.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = input.length() / 2;
            length = 1;
        }
        return input.substring(position, position + length);
    }
}
