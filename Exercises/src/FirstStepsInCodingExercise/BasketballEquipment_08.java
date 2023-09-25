package FirstStepsInCodingExercise;
import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double snickers = yearTax - (0.4 * yearTax);
        double suit = snickers - (0.2 * snickers);
        double ball = ( (double) 1 / 4 ) * suit;
        double accessories = ( (double) 1 / 5) * ball;

        double totalPrice = yearTax + snickers + suit + ball + accessories;

        System.out.println(totalPrice);

    }
}