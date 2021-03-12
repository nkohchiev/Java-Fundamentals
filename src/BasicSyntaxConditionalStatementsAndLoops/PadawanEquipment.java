package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        int lightsabers = (int) Math.ceil(students*1.1);
        int belts = (students-students/6);
        double totalCost = priceLightsabers*lightsabers+belts*priceBelts+priceRobes*students;

        if (money>= totalCost){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.", totalCost-money);
        }
    }
}
