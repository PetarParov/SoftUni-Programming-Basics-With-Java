package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationBreak / 8.0;
        double rest = durationBreak / 4.0;

        double totalTime = durationBreak - (lunchTime + rest);

        double diff = Math.ceil(Math.abs(totalTime - durationEpisode));
        if (totalTime >= durationEpisode)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, diff);
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, diff);
        }
    }
}