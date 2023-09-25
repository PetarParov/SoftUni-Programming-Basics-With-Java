package ForLoopExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Четене на числата
        int n = Integer.parseInt(scanner.nextLine());

//Създаваме променливи за броя числа в конкретен диапазон
        double p1 = 0; // процент на числата под 200
        double p2 = 0; // процент на числата от 200 до 399
        double p3 = 0; // процент на числата от 400 до 599
        double p4 = 0; // процент на числата от 600 до 799
        double p5 = 0; // процент на числата от 800 нагоре


        //Цикъл за проверка
        for (int i = 1; i <= n; i++)

        {
            //Въвеждане на ново число
            int newNumber = Integer.parseInt(scanner.nextLine());

            // Проверка кой интервал принадлежи числото и увеличаване на съответния брояч
            if (newNumber < 200)
            {
                p1++; // увеличаване на брояча за числа под 200
            }
            else if (newNumber <= 399)
            {
                p2++; // увеличаване на брояча за числа от 200 до 399
            }
            else if (newNumber <= 599)
            {
                p3++; // увеличаване на брояча за числа от 400 до 599
            }
            else if (newNumber <= 799)
            {
                p4++; // увеличаване на брояча за числа от 600 до 799
            } else
            {
                p5++; // увеличаване на брояча за числа от 800 нагоре
            }
        }

        // Изчисляване на процентите
        p1 = (p1 / n) * 100;
        p2 = (p2 / n) * 100;
        p3 = (p3 / n) * 100;
        p4 = (p4 / n) * 100;
        p5 = (p5 / n) * 100;

        // Показване на процентите с форматиран изход
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);

    }
}
