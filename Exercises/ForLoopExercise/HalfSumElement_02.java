package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= n ; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > maxNumber)
            {
                maxNumber = number;
            }

        }

        int sumWithoutMax = sum - maxNumber;

        if (sumWithoutMax == maxNumber)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", sumWithoutMax);
        }
        else
        {
            int diff = Math.abs(sumWithoutMax - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d%n", diff);
        }

    }
}