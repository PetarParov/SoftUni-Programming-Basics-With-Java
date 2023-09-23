package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        switch (name)
        {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
