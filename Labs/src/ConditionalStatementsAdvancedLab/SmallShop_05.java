package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    System.out.println (amount * 0.50);
                    break;

                case "water":
                    System.out.println (amount * 0.80);
                    break;

                case "beer":
                    System.out.println (amount * 1.20);
                    break;

                case "sweets":
                    System.out.println (amount * 1.45);
                    break;

                case "peanuts":
                    System.out.println (amount * 1.60);
                    break;
            }
        }
        if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    System.out.println (amount * 0.40);
                    break;

                case "water":
                    System.out.println (amount * 0.70);
                    break;

                case "beer":
                    System.out.println (amount * 1.15);
                    break;

                case "sweets":
                    System.out.println (amount * 1.30);
                    break;

                case "peanuts":
                    System.out.println (amount * 1.50);
                    break;
            }
        }
        if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    System.out.println (amount * 0.45);
                    break;

                case "water":
                    System.out.println (amount * 0.70);
                    break;

                case "beer":
                    System.out.println (amount * 1.10);
                    break;

                case "sweets":
                    System.out.println (amount * 1.35);
                    break;

                case "peanuts":
                    System.out.println (amount * 1.55);
                    break;
            }
        }
    }
}
