package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comission = 0;

        if (sales >=0 && sales <= 500)
        {
            switch (city)
            {
                case "Sofia":
                    comission = sales * ((double) 5 / 100);
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = (sales * (4.5 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = (sales * (5.5 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        else if (sales > 500 && sales <= 1000)
        {
            switch (city)
            {
                case "Sofia":
                    comission = sales * ((double) 7 / 100);
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = (sales * (7.5 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = (sales * ((double) 8 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        else if (sales > 1000 && sales <= 10000)
        {
            switch (city)
            {
                case "Sofia":
                    comission = sales * ((double) 8 / 100);
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = (sales * ((double) 10 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = (sales * ((double) 12 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        else if (sales > 10000)
        {
            switch (city)
            {
                case "Sofia":
                    comission = sales * ((double) 12 / 100);
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = (sales * ((double) 13 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = (sales * (14.5 / 100));
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        else
        {
            System.out.println("error");
        }
    }
}
