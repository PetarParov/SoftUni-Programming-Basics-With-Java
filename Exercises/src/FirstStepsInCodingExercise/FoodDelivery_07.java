package FirstStepsInCodingExercise;
import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veganPrice = veganMenu * 8.15;

        double totalMenuPrice = chickenPrice + fishPrice + veganPrice;

        double dessertPrice = 0.2 * totalMenuPrice;

        double totalPrice = totalMenuPrice + dessertPrice + 2.5;

        System.out.println(totalPrice);

    }
}
