package ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int giftSum = 10;
        int toyCount = 0;
        int totalSavedMoney = 0;



        for (int i = 1; i <= age; i++)
        {
            if (i % 2 == 0)
            {
                sum += giftSum;
                giftSum += 10;
                sum--;
            }
            else
            {
                toyCount++;
            }
        }

        int totalToySum = toyCount * toyPrice;
        totalSavedMoney = sum + totalToySum;

        double diff = Math.abs(totalSavedMoney - washingMachinePrice);
        if (totalSavedMoney >= washingMachinePrice)
        {
            System.out.printf("Yes! %.2f", diff);
        }
        else
        {
            System.out.printf("No! %.2f", diff);
        }

    }
}