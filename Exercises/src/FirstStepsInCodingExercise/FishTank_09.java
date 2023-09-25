package FirstStepsInCodingExercise;
import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double tankVolume = (a * b * c) * 0.001;

        double neededLiters = tankVolume - ((percent / 100) * tankVolume);

        System.out.println(neededLiters);

    }
}
