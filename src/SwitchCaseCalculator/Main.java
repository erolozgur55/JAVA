package SwitchCaseCalculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Designing a 4 operations calculator using Switch Case
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String transactions = "1. To collect \n"
                + "2. Extraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + " Press 5 to Exit";
        System.out.println(transactions);
        System.out.println("************************************");
        System.out.println("Please Select Transaction:");

        String transaction = scanner.nextLine();
        int a;
        int b;

        switch (transaction) {
            case "1":
                System.out.print("number 1: ");
                a = scanner.nextInt();
                System.out.print("number 2: ");
                b = scanner.nextInt();
                System.out.println("Sums of entered numbers : " + (a + b));
                break;
            case "2":
                System.out.print("number 1: ");
                a = scanner.nextInt();
                System.out.print("number 2: ");
                b = scanner.nextInt();
                System.out.println("Entered Numbers Differences : " + (a - b));
                break;
            case "3":
                System.out.print("number 1: ");
                a = scanner.nextInt();
                System.out.print("number 2: ");
                b = scanner.nextInt();
                System.out.println("Multiplications of entered numbers : " + (a * b));
                break;
            case "4":
                System.out.print("number 1: ");
                a = scanner.nextInt();
                System.out.print("number 2: ");
                b = scanner.nextInt();
                System.out.println("Division of Entered Numbers : " + ((double) a / b));
                break;
            case "5":
                System.out.println("Exiting The Program....");
                break;
            default:
                System.out.println("Invalid Transaction");


        }
     }
}