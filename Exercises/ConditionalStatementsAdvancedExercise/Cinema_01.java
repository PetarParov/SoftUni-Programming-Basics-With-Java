package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seatsNumber = rows * columns;
        double price = 0;

        switch (projection) {
            case "Premiere":
                price = seatsNumber * 12;
                break;

            case "Normal":
                price = seatsNumber * 7.5;
                break;

            case "Discount":
                price = seatsNumber * 5;
                break;
        }

        System.out.printf("%.2f leva", price);

    }
}
