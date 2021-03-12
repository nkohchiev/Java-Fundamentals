package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numArray1 = scanner.nextLine().split(" ");
        String[] numArray2 = scanner.nextLine().split(" ");


        for (int i = 0; i < numArray2.length; i++) {
            for (int j = 0; j < numArray1.length; j++) {// inner loop
                if (numArray2[i].equals(numArray1[j])) {
                    System.out.print(numArray2[i] + " ");
                    break;
                }
            }
        }
    }
}
