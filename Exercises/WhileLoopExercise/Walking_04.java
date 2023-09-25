package WhileLoopExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSteps = 0;

        while (countSteps < 10000) {

            String command = scanner.nextLine();
            if (command.equals("Going home")) {
                int countStepsGoingBack = Integer.parseInt(scanner.nextLine());
                countSteps += countStepsGoingBack;
                break;
            } else {
                int currentDaySteps = Integer.parseInt(command);
                countSteps += currentDaySteps;
            }
        }

        int diff = Math.abs(countSteps - 10000);
        if (countSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);

        }
    }
}