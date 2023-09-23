package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squarem = Double.parseDouble(scanner.nextLine());
        double fullprice = squarem * 7.61;
        double discount = 0.18 * fullprice;
        double finalprice = fullprice - discount;

        System.out.println("The final price is: " + finalprice  + " lv.");
        System.out.println("The discount is: " + discount  + " lv.");

    }
}
