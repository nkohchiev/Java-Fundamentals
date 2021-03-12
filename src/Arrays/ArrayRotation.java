package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations ; i++) {
            String currentElement = array[0];
            // shift left
            for (int j = 0; j < array.length - 1  ; j++) {

                array[j] = array[j+1];
            }
            // add first element to last position
            array[array.length - 1] = currentElement;
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
