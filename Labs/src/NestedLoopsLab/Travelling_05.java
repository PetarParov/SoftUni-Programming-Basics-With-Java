package NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < neededMoney){
                double sumForSave = Double.parseDouble(scanner.nextLine());
                savedMoney += sumForSave;
            }
            System.out.printf("Going to %s!%n", input);
            input = scanner.nextLine();
        }
    }
}
