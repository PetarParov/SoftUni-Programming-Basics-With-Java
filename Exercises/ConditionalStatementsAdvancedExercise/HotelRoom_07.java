package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerStudio = 0;
        double pricePerApartment = 0;

        switch (month)
        {
            case "May":
            case "October":
                pricePerStudio = nights * 50;
                pricePerApartment = nights * 65;

                if (nights > 14)
                {
                    pricePerStudio = pricePerStudio * 0.7;
                    pricePerApartment = pricePerApartment * 0.9;
                }
                else if (nights > 7)
                {
                    pricePerStudio = pricePerStudio * 0.95;
                }
                break;

            case "June":
            case "September":
                pricePerStudio = nights * 75.20;
                pricePerApartment = nights * 68.70;

                if (nights > 14)
                {
                    pricePerStudio = pricePerStudio * 0.8;
                    pricePerApartment = pricePerApartment * 0.9;
                }
                break;

            case "July":
            case "August":
                pricePerStudio = nights * 76;
                pricePerApartment = nights * 77;
                if (nights > 14)
                {
                    pricePerApartment = pricePerApartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", pricePerApartment);
        System.out.printf("Studio: %.2f lv.", pricePerStudio);
    }
}
