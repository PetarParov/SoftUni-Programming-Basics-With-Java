package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0 || number >= 100 && number <= 200)
        {

        }
        else
        {
            System.out.println("invalid");
        }
    }
}