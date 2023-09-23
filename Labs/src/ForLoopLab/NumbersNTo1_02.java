package ForLoopLab;

import java.util.Scanner;

public class NumbersNTo1_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int n = Integer.parseInt(scanner.nextLine()); n>=1; n--)
        {
            System.out.println(n);
        }
    }
}