package ForLoopLab;

import java.util.Scanner;

public class Numbers1ToNWithStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int n2 = 1; n2 <= number; n2 += 3)
        {
            System.out.println(n2);
        }
    }
}