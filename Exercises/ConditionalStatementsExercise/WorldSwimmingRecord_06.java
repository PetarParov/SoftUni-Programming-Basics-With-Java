package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double timeForDistance = timeForMeter * distance;
        double howMuch = Math.floor (distance / 15);
        double delay = howMuch * 12.5;
        double totalTime = timeForDistance + delay;

        if (totalTime >= record)
        {
            double diff = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
        else
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
