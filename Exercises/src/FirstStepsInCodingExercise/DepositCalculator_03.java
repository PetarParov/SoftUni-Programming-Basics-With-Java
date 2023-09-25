package FirstStepsInCodingExercise;
import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double GodLihvenProcent = Double.parseDouble(scanner.nextLine());

        double obshtaLihva = deposit * (GodLihvenProcent / 100.0);
        double lihvaMesec = obshtaLihva / 12;

        double totalSum = deposit + (months * lihvaMesec);

        System.out.println(totalSum);



    }
}