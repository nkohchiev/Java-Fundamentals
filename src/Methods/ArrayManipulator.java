package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] basicArr = scan.nextLine().split(" ");
        int[] array = new int[basicArr.length];
        for (int i = 0; i < basicArr.length; i++) {
            array[i] = Integer.parseInt(basicArr[i]);
        }
        String inputCommand = scan.nextLine();
        while (!inputCommand.equals("end")) {
            String[] command = inputCommand.split(" ");
            if (command[0].equals("exchange")) {
                exchange(command, array);
            } else if (command[0].equals("max")) {
                maxEvenOddIndex(command, array);
            } else if (command[0].equals("min")) {
                minEvenOddIndex(command, array);
            } else if (command[0].equals("first")) {
                firstEvenOdd(command, array);
            } else if (command[0].equals("last")) {
                lastEvenOdd(command, array);
            }
            inputCommand = scan.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }


    private static void exchange(String[] command, int[] array) {
        int exchangeIndex = Integer.parseInt(command[1]);
        if (exchangeIndex >= array.length || exchangeIndex<0) {
            System.out.println("Invalid index");
        } else {
            for (int i = 0; i < exchangeIndex + 1; i++) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
        }
    }

    private static void maxEvenOddIndex(String[] command, int[] array) {
        int maxValueIndex = -1;
        if (command[1].equals("even")) {
            int currentNum = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    if (array[i] >= currentNum) {
                        currentNum = array[i];
                        maxValueIndex = i;
                    }
                }
            }
        } else if (command[1].equals("odd")) {
            int currentNum = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    if (array[i] >= currentNum) {
                        currentNum = array[i];
                        maxValueIndex = i;
                    }
                }
            }
        }
        if (maxValueIndex < 0) {
            System.out.println("No matches");
        } else {
            System.out.println(maxValueIndex);
        }
    }

    private static void minEvenOddIndex(String[] command, int[] array) {
        int minValueIndex = -1;
        if (command[1].equals("even")) {
            int currentNum = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    if (array[i] <= currentNum) {
                        currentNum = array[i];
                        minValueIndex = i;
                    }
                }
            }
        } else if (command[1].equals("odd")) {
            int currentNum = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    if (array[i] <= currentNum) {
                        currentNum = array[i];
                        minValueIndex = i;
                    }
                }
            }
        }
        if (minValueIndex < 0) {
            System.out.println("No matches");
        } else {
            System.out.println(minValueIndex);
        }
    }

    private static void firstEvenOdd(String[] command, int[] array) {
        int num = Integer.parseInt(command[1]);
        if (num > array.length) {
            System.out.println("Invalid count");
        } else {
            int[] currentArr = new int[0];
            int counter = 0;
            if (command[2].equals("even")) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        counter++;
                        if (counter > num) {
                            break;
                        }
                        currentArr=arrayPlusOne(currentArr, array[i]);
                    }
                }
            } else if (command[2].equals("odd")) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 != 0) {
                        counter++;
                        if (counter > num) {
                            break;
                        }
                        currentArr=arrayPlusOne(currentArr, array[i]);
                    }
                }
            }
            printArr(currentArr);
            // вместо метода за принта System.out.println(Arrays.toString(array));
        }
    }

    private static void lastEvenOdd(String[] command, int[] array) {
        int num = Integer.parseInt(command[1]);
        if (num > array.length) {
            System.out.println("Invalid count");
        } else {
            int[] currentArr = new int[0];
            if (command[2].equals("even")) {
                int counter = 0;
                for (int i = array.length - 1; i >= 0; i--) {
                    if (array[i] % 2 == 0) {
                        counter++;
                        if (counter > num) {
                            break;
                        }
                        currentArr=arrayPlusOne(currentArr, array[i]);
                    }
                }
            } else if (command[2].equals("odd")) {
                int counter = 0;
                for (int i = array.length - 1; i >= 0; i--) {
                    if (array[i] % 2 != 0) {
                        counter++;
                        if (counter > num) {
                            break;
                        }
                        currentArr=arrayPlusOne(currentArr, array[i]);
                    }
                }
            }
            for (int i = 0; i <currentArr.length/2 ; i++) {
                int tepm = currentArr[i];
                currentArr[i]=currentArr[currentArr.length-1-i];
                currentArr[currentArr.length-1-i]=tepm;

            }
            printArr(currentArr);
        }
    }
    public static int[] arrayPlusOne (int [] arrayToExpand, int newDigit){
        int [] temp =new int[arrayToExpand.length+1];
        for (int i = 0; i <arrayToExpand.length ; i++) {
            temp[i]=arrayToExpand[i];
        }
        temp[temp.length-1]= newDigit;
        return temp;
    }

    private static void printArr(int[] input) {
        if (input.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < input.length; i++) {
                if (i==0){
                    System.out.print(input[i]);
                }else{
                    System.out.print(", "+input[i]);
                }
            }
            System.out.println("]");
        }
    }
}
