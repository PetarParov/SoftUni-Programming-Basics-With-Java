package WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countPieces = w * l;

        while (!command.equals("STOP")){

            int takenPieces = Integer.parseInt(command);
            countPieces -= takenPieces;
            if (countPieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
                break;
            }

            command = scanner.nextLine();

        }
        if (countPieces > 0) {

            System.out.printf("%d pieces are left.", countPieces);
        }

    }
}