package FirstStepsInCodingExercise;
import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTimeForReading = pages / pagesPerHour;
        int neededHours = totalTimeForReading / days;

        System.out.println(neededHours);
    }
}