package ConditionalStatementsExercise;
import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProcessors = processors * (priceVideoCards * 0.35);
        double priceRam = ram * (priceVideoCards * 0.10);
        double totalPrice = priceVideoCards + priceProcessors + priceRam;

        if (videoCards > processors)
        {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        double diff = Math.abs(budget - totalPrice);
        if (totalPrice <= budget)
        {
            System.out.printf("You have %.2f leva left!", diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}