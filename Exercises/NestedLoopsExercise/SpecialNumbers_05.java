package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <= 9999 ; currentNum++) {

            String num = "" + currentNum;
            int firstDigit = Integer.parseInt(String.valueOf(num.charAt(0)));
            int secondDigit = Integer.parseInt(String.valueOf(num.charAt(1)));
            int thirdDigit = Integer.parseInt(String.valueOf(num.charAt(2)));
            int fourthDigit = Integer.parseInt(String.valueOf(num.charAt(3)));

//            int firstDigit = currentNum / 1000 % 10;
//            int secondDigit = currentNum / 100 % 10;
//            int thirdDigit = currentNum / 10 % 10;
//            int fourthDigit = currentNum % 10;

            boolean checkFirst = n % firstDigit == 0;
            boolean checkSecond = secondDigit != 0 && n % secondDigit == 0;
            boolean checkThird = thirdDigit != 0 && n % thirdDigit == 0;
            boolean checkFourth= fourthDigit != 0 && n % fourthDigit == 0;

            if (checkFirst && checkSecond && checkThird && checkFourth) {
                System.out.printf("%d ", currentNum);
            }
        }

    }
}