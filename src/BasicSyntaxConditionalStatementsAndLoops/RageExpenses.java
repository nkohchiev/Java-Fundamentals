package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lostGamesCount = Double.parseDouble(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetCount = 0;
        double mouseCount = 0;
        double keyboardCount = 0;
        double displayCount = 0;

        for (int i = 1; i <=lostGamesCount ; i++) {

            if ( i % 2 == 0) {
                headsetCount++;
            }

            if ( i % 3 == 0) {
                mouseCount++;
            }

            if ( i % 6 == 0) {
                keyboardCount++;
            }

            if ( i % 12 == 0) {
                displayCount++;
            }
        }
        double total = headsetPrice * headsetCount + mousePrice * mouseCount + keyboardPrice * keyboardCount + displayPrice * displayCount;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
