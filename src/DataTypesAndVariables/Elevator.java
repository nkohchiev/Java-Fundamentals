package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numPeople / capacity;

        if ( numPeople <= capacity) {
            System.out.println("1");
        } else if (numPeople % capacity == 0) {
            System.out.println(courses);
        } else {
            courses += 1;
            System.out.println(courses);
        }

    }
}
