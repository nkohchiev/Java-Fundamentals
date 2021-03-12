package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length() ; i++) {
            int digit = input.charAt(i) - 48;

            //9! = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
            int fact = 1;

            for (int j = 1; j <= digit; j++) {

                fact*= j;
            }
            sum += fact;
        }

        int inputNum = Integer.parseInt(input);
        if ( sum == inputNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
