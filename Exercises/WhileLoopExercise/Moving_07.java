package WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int availableSpaceForBoxes = w * l * h;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            int currentBoxes = Integer.parseInt(command);
            availableSpaceForBoxes -= currentBoxes;
            if (availableSpaceForBoxes <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpaceForBoxes));
                break;
            }
            command = scanner.nextLine();
        }
        if (availableSpaceForBoxes > 0) {

            System.out.printf("%d Cubic meters left.", availableSpaceForBoxes);
        }
    }
}
