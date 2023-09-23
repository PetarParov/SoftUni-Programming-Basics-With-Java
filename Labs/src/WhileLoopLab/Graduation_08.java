package WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int year = 1;
        double sumGrades = 0;
        double grade = 0;

        while (year <= 12) {

            grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                year++;
            }
            sumGrades += grade;

            if (grade == 2){
                break;
            }

        }
        if (grade == 2) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double averageGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }

    }
}