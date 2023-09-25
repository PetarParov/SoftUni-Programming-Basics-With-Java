package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (flowers)
        {
            case "Roses":
                totalSum = countFlowers * 5;
                if (countFlowers > 80)
                {
                    totalSum = totalSum - (totalSum * 0.1);
                }
                break;
            case "Dahlias":
                totalSum = countFlowers * 3.80;
                if (countFlowers > 90)
                {
                    totalSum = totalSum - (totalSum * 0.15);
                }
                break;
            case "Tulips":
                totalSum = countFlowers * 2.80;
                if (countFlowers > 80)
                {
                    totalSum = totalSum - (totalSum * 0.15);
                }
                break;
            case "Narcissus":
                totalSum = countFlowers * 3;
                if (countFlowers < 120)
                {
                    totalSum = totalSum + (totalSum * 0.15);
                }
                break;
            case "Gladiolus":
                totalSum = countFlowers * 2.50;
                if (countFlowers < 80)
                {
                    totalSum = totalSum + (totalSum * 0.20);
                }
                break;
        }
        double diff = Math.abs(budget - totalSum);
        if (budget >= totalSum)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, diff);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}