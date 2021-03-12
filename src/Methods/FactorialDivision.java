package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(numberOne) * 1.0 / calculateFactorial(numberTwo);

        System.out.printf("%.2f",result);
    }

    private static long calculateFactorial( int n) {

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
