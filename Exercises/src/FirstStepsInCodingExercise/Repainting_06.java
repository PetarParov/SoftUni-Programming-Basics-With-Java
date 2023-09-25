package FirstStepsInCodingExercise;
import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hoursWork = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = ( paint + (0.1 * paint)) * 14.5;
        double razreditelPrice = razreditel * 5.00;

        double totalSumMaterials = nylonPrice + paintPrice + razreditelPrice + 0.40;

        double workPrice = (totalSumMaterials * 0.3) * hoursWork;

        double finalPrice = totalSumMaterials + workPrice;

        System.out.println(finalPrice);

    }

}
