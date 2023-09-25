package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFavouriteBook = scanner.nextLine();
        String command = scanner.nextLine();
        int countBooks = 0;

        while (!command.equals("No More Books"))
        {
            if (command.equals(nameFavouriteBook)) {
                System.out.printf("You checked %d books and found it.", countBooks);
                break;
            }
            command = scanner.nextLine();
            countBooks++;
        }
        if (!command.equals(nameFavouriteBook)) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }

    }
}
