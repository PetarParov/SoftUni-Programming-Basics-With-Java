package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Четем цялото число n
        int n = Integer.parseInt(scanner.nextLine());
        // Създаваме променлива за текущото число
        int num = 1;
        // Цикъл за редовете от 1 до n
        for (int row = 1; row <= n; row++) {
            // Цикъл за колоните от 1 до row
            for (int col = 1; col <= row; col++) {
                // Отпечатваме текущото число с интервал след него
                System.out.print(num + " ");
                // Увеличаваме текущото число с 1
                num++;
                // Ако текущото число е по-голямо от n, прекъсваме вътрешния цикъл
                if (num > n) {
                    break;
                }
            }
            // Отпечатваме нов ред
            System.out.println();
            // Ако текущото число е по-голямо от n, прекъсваме външния цикъл
            if (num > n) {
                break;
            }
        }
    }
}