package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                countCombinations++;
                int sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombinations, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
    }
}
