package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countStudents = 0;
        double sumAllGrades = 0;

        while (!input.equals("Finish")){

            double sumGrades = 0;

            for (int i = 1; i <= countPeople ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }
            double averageGradePresentation = sumGrades / countPeople;

            sumAllGrades += averageGradePresentation;
            countStudents++;
            System.out.printf("%s - %.2f.%n", input, averageGradePresentation);

            input = scanner.nextLine();
        }
        double averageGradeAllStudents = sumAllGrades / countStudents;

        System.out.printf("Student's final assessment is %.2f.", averageGradeAllStudents);

    }
}