package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }
        for (int i = 0; i < n; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }
        if (leftSum == rightSum)
        {
            System.out.println("Yes, sum = " + leftSum);
        }
        else
        {
            int diff = Math.abs (leftSum - rightSum);
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}