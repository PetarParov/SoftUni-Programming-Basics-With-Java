package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());

        double dogfood = dog * 2.5;
        int catfood = cat * 4;

        double finalsum = dogfood + catfood;

        System.out.printf("%f lv.", finalsum);

    }
}
