package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int averagePoints = 0;
        double countWins = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String stageOfTournament = scanner.nextLine();

            switch (stageOfTournament)
            {
                case "W":
                    countWins++;
                    tournamentPoints += 2000;
                    break;

                case "F":
                    tournamentPoints += 1200;
                    break;

                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }
        int finalPoints = startingPoints + tournamentPoints;
        averagePoints = tournamentPoints / countTournaments;
        double winningPercent = countWins / countTournaments * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%%n", winningPercent);

    }
}