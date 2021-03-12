package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        int resultOne = sumInts (one,two) - three;


        System.out.println(resultOne);

    }



    private static int sumInts(int one, int two) {

        return one + two;
    }

}
