package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroupsClimbers = Integer.parseInt(scanner.nextLine());

        int countMusala = 0;
        int countMonblan = 0;
        int countKilimanjaro = 0;
        int countK2 = 0;
        int countEverest = 0;

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= countGroupsClimbers ; i++)
        {
            int countClimbersInGroup = Integer.parseInt(scanner.nextLine());

            if (countClimbersInGroup <= 5)
            {
                countMusala += countClimbersInGroup;
            }
            else if (countClimbersInGroup <= 12)
            {
                countMonblan += countClimbersInGroup;
            }
            else if (countClimbersInGroup <= 25)
            {
                countKilimanjaro += countClimbersInGroup;
            }
            else if (countClimbersInGroup <= 40)
            {
                countK2 += countClimbersInGroup;
            }
            else
            {
                countEverest += countClimbersInGroup;
            }
        }

        int totalClimbers = countMusala + countMonblan + countKilimanjaro + countK2 + countEverest;

        p1 = (double) countMusala / totalClimbers * 100;
        p2 = (double) countMonblan / totalClimbers * 100;
        p3 = (double) countKilimanjaro / totalClimbers * 100;
        p4 = (double) countK2 / totalClimbers * 100;
        p5 = (double) countEverest / totalClimbers * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}