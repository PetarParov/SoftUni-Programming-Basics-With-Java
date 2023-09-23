package NestedLoopsLab;


import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloors; floor >= 1 ; floor--) {
            for (int rooms = 0;  rooms < countRooms ; rooms++) {
                if (floor == countFloors) {
                    System.out.printf("L%d%d ", floor, rooms);
                }
                else if (floor % 2 == 0){
                    System.out.printf("O%d%d ", floor, rooms);
                }
                else {
                    System.out.printf("A%d%d ", floor, rooms);
                }
            }
            System.out.println();
        }

    }
}