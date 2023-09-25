package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")){
            int currentNumber = Integer.parseInt(input);
            boolean isPrime = true;
            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0){
                    sumNonPrime += currentNumber;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sumPrime += currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);

    }
}