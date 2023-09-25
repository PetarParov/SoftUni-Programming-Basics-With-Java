package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int countTotalTickets = 0;
        int countTotalStudentTickets = 0;
        int countTotalStandartTickets = 0;
        int countTotalKidTickets = 0;

        while (!movieName.equals("Finish")){
            int countFreeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int countTicketsPerMovie = 0;
            while (!ticketType.equals("End")){
                switch (ticketType){
                    case "student":
                        countTotalStudentTickets++;
                        countTicketsPerMovie++;
                        break;

                    case "standard":
                        countTotalStandartTickets++;
                        countTicketsPerMovie++;
                        break;

                    case "kid":
                        countTotalKidTickets++;
                        countTicketsPerMovie++;
                        break;
                }
                if (countTicketsPerMovie == countFreeSeats){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            countTotalTickets += countTicketsPerMovie;
            double percentFull = (double) countTicketsPerMovie / countFreeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);
            movieName = scanner.nextLine();
        }
        double percentStudent = (double) countTotalStudentTickets / countTotalTickets * 100;
        double percentStandart = (double) countTotalStandartTickets / countTotalTickets * 100;
        double percentKid = (double) countTotalKidTickets / countTotalTickets * 100;
        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentStandart);
        System.out.printf("%.2f%% kids tickets.", percentKid);
    }
}