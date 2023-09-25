package ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());

        double currentPoints = 0;
        double totalPoints = pointsFromAcademy + currentPoints;

        for (int i = 1; i <= countExaminers ; i++)
        {
            String nameExaminer = scanner.nextLine();
            double pointsExaminer = Double.parseDouble(scanner.nextLine());
            currentPoints = (nameExaminer.length() * pointsExaminer) / 2;
            totalPoints += currentPoints;

            if (totalPoints >= 1250.5)
            {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
                break;
            }

        }
        if (totalPoints < 1250.5)
        {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, (1250.5 - totalPoints));
        }
    }
}