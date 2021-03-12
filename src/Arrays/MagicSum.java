package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1 ; i++) {

            int firstNumber = numbers[i];

            for (int j = i + 1; j < numbers.length ; j++) {

                int secondNumber = numbers[j];

                if (firstNumber + secondNumber == number) {
                    System.out.println(firstNumber + " " + secondNumber);
                }

            }


        }
    }
}
