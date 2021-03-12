package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int smallerFirst = findTheSmallestNumber(first, second);
        int smallestNumber = findTheSmallestNumber(smallerFirst, third);

        System.out.println(smallestNumber);

    }

    private static int findTheSmallestNumber(int a, int b) {
        if (a < b) {
            return a;
        }

        return b;
    }
}
