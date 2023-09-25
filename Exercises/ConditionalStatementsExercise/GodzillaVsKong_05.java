package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatist = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double sumClothes = priceClothes * countStatist;

        if (countStatist > 150)
        {
            sumClothes = sumClothes - (sumClothes * 0.1);
        }
        double totalSum = decor + sumClothes;
        double diff = Math.abs(budget-totalSum);

        if (totalSum > budget)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
        else
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}