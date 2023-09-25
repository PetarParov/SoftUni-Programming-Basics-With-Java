package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accommodation = "";
        double spendMoney = 0;

        if (budget <=100)
        {
            destination = "Bulgaria";
            if (season.equals("summer"))
            {
                accommodation = "Camp";
                spendMoney = budget * 0.3;
            }
            else if (season.equals("winter"))
            {
                accommodation = "Hotel";
                spendMoney = budget * 0.7;
            }

        }
        else if (budget <= 1000 && season.equals("summer"))
        {
            destination = "Balkans";
            accommodation = "Camp";
            spendMoney = budget * 0.4;
        }
        else if (budget <= 1000 && season.equals("winter"))
        {
            destination = "Balkans";
            accommodation = "Hotel";
            spendMoney = budget * 0.8;
        }
        if (budget > 1000)
        {
            destination = "Europe";
            accommodation = "Hotel";
            spendMoney = budget * 0.9;
        }

        System.out.printf("Somewhere in %s  %n", destination);
        System.out.printf("%s - %.2f", accommodation, spendMoney);

    }
}