package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (room)
        {
            case "room for one person":
                price = nights * 18;
                break;

            case "apartment":
                price = nights * 25;
                if (days < 10)
                {
                    price = price * 0.7;
                }
                else if (days < 15)
                {
                    price = price * 0.65;
                }
                else
                {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = nights * 35;
                if (days < 10)
                {
                    price = price * 0.9;
                }
                else if (days < 15)
                {
                    price = price * 0.85;
                }
                else
                {
                    price = price * 0.80;
                }
                break;
        }
        switch (grade)
        {
            case "positive":
                price = price + (price * 0.25);
                break;
            case "negative":
                price = price - (price * 0.1);
                break;
        }
        System.out.printf("%.2f", price);
    }
}
