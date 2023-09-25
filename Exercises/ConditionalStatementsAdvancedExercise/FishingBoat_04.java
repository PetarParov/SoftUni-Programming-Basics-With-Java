package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double rentAShip = 0;

        switch (season)
        {
            case "Spring":
                rentAShip = 3000;
                if (fishermen <= 6)
                {
                    rentAShip = rentAShip * 0.9;
                }
                else if (fishermen <= 11)
                {
                    rentAShip = rentAShip - (rentAShip * 0.15);
                }
                else
                {
                    rentAShip = rentAShip - (rentAShip * 0.25);
                }
                break;
            case "Summer":
            case "Autumn":
                rentAShip = 4200;
                if (fishermen <= 6)
                {
                    rentAShip = rentAShip * 0.9;
                }
                else if (fishermen <= 11)
                {
                    rentAShip = rentAShip - (rentAShip * 0.15);
                }
                else
                {
                    rentAShip = rentAShip - (rentAShip * 0.25);
                }
                break;
            case "Winter":
                rentAShip = 2600;
                if (fishermen <= 6)
                {
                    rentAShip = rentAShip * 0.9;
                }
                else if (fishermen <= 11)
                {
                    rentAShip = rentAShip - (rentAShip * 0.15);
                }
                else
                {
                    rentAShip = rentAShip - (rentAShip * 0.25);
                }
                break;
        }
        if (fishermen % 2 == 0 != season.equals("Autumn"))
        {
            rentAShip = rentAShip * 0.95;
        }
        double diff = Math.abs(budget - rentAShip);
        if (rentAShip <= budget)
        {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
