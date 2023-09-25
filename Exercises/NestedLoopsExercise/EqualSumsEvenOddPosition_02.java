package NestedLoopsExercise;
import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = firstNumber; currentNumber <= secondNumber ; currentNumber++) {

            String num= "" + currentNumber;

            int firstDigit = num.charAt(0);
            int secondDigit = num.charAt(1);
            int thirdDigit = num.charAt(2);
            int fourthDigit = num.charAt(3);
            int fifthDigit = num.charAt(4);
            int sixthDigit = num.charAt(5);


//            int firstDigit = currentNumber / 100000;
//            int secondDigit = currentNumber / 10000 % 10;
//            int thirdDigit = currentNumber / 1000 % 10;
//            int fourthDigit = currentNumber / 100 % 10;
//            int fifthDigit = currentNumber / 10 % 10;
//            int sixthDigit = currentNumber % 10;

            int sumOdd = firstDigit + thirdDigit + fifthDigit;
            int sumEven = secondDigit + fourthDigit + sixthDigit;

            if (sumEven == sumOdd){
                System.out.printf("%d ", currentNumber);
            }

        }

    }
}
