package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalLiters = 0;

        for (int i = 0; i < n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (currentLiters + totalLiters > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLiters += currentLiters;
            }
        }

        System.out.println(totalLiters);
    }
}
