package WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int countDaysSpent = 0;
        int allDays = 0;

        while (ownedMoney < neededMoney) {
            if (countDaysSpent == 5)
            {
                break;
            }
            String command = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());
            allDays++;

            if (command.equals("spend")) {
                countDaysSpent++;
                ownedMoney -= currentSum;
            } else if (command.equals("save")) {
                ownedMoney += currentSum;
                countDaysSpent = 0;
            }

            if (ownedMoney < 0) {
                ownedMoney = 0;
            }

        }
        if (countDaysSpent == 5){
            System.out.println("You can't save the money.");
            System.out.println(allDays);
        } else  {
            System.out.printf("You saved the money for %d days.", allDays);
        }

    }
}
