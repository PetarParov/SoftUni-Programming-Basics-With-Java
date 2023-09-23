package ForLoopLab;


import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();

        for (int index = 0; index <= length - 1; index++)
        {
            System.out.println(text.charAt(index));
        }
    }
}