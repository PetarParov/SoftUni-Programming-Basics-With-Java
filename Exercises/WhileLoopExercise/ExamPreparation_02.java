package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPoorGrades = Integer.parseInt(scanner.nextLine());

        String nameTask = scanner.nextLine();

        int countCurrentPoorGrades = 0;

        int sumGrades = 0;

        int countExams = 0;

        String lastExam = "";

        while (!nameTask.equals("Enough")) {
            int currentGrade = Integer.parseInt(scanner.nextLine());
            sumGrades += currentGrade;
            countExams++;
            if (currentGrade <= 4) {
                countCurrentPoorGrades++;
            }
            if (countCurrentPoorGrades == countPoorGrades) {
                System.out.printf("You need a break, %d poor grades.", countCurrentPoorGrades);
                break;
            }
            lastExam = String.valueOf(nameTask);
            nameTask = scanner.nextLine();
        }
        if (nameTask.equals("Enough")) {
            double averageGrade = (double) sumGrades / countExams;
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", countExams);
            System.out.printf("Last problem: %s%n", lastExam);
        }

    }
}