package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int totalExamMinutes = examHour * 60 + examMinute;
        int totalArrivalMinutes = arrivalHour * 60 + arrivalMinute;
        int arrivalMinutesMinus = totalExamMinutes - 30;
        int diff = Math.abs(totalExamMinutes - totalArrivalMinutes);
        int hour = diff / 60;
        int minutes = diff % 60;

        if (totalArrivalMinutes > totalExamMinutes)
        {
            System.out.println("Late");
            if (diff < 60)
            {
                System.out.printf("%d minutes after the start", diff);
            }
            else
            {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }
        else if (totalArrivalMinutes >= arrivalMinutesMinus)
        {
            System.out.println("On time");
            if (diff < 60)
            {
                System.out.printf("%d minutes before the start", diff);
            }
            else
            {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
        else
        {
            System.out.println("Early");
            if (diff < 60)
            {
                System.out.printf("%d minutes before the start", diff);
            }
            else
            {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}