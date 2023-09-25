package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        int totalToys = puzzles + dolls + bears + minions + trucks;

        if (totalToys >= 50)
        {
            sum = sum - (sum * 0.25);
        }

        double profit = sum - (sum * 0.1);

        double diff = profit - tripPrice;

        if (profit >= tripPrice)
        {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else
        {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(diff));
        }
    }
}
