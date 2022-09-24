package While_AtmProgramming;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
todo
       We do not make an ATM program with the help of the while loop.
               Transactions
       "1.transaction : Amaount Learning "
       "2.transaction : Withdraw money"
       "3.transaction : To deposit money"
       "Press A to Exit";
        
        */
        Scanner scanner = new Scanner(System.in);
        int amount = 1000;
        String transactions = "1.transaction : Amaount Learning \n"
                            + "2.transaction : Withdraw money\n"
                            + "3.transaction : To deposit money\n"
                            + "Press A to Exit";
        
        System.out.println("*************************");
        System.out.println(transactions);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("Please Select Transaction : ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("A")) {
                
                System.out.println("Exiting The Program...");
                break;
            }
            else if (transaction.equals("1")){
                System.out.println("amount : " + amount);
            }
            else if (transaction.equals("2")){
                System.out.print("Withdraw money amount : ");
                int total = scanner.nextInt();
                scanner.nextLine();
                
                if (amount - total < 0) {
                    
                    System.out.println("Not Enough Amount. Amount : " + amount);
                }
                else {
                    amount -= total;
                    System.out.println("New amount : " + amount);
                }
                
                
            }
            else if (transaction.equals("3")){
                System.out.print("To deposit money total : ");
                int total = scanner.nextInt();
                scanner.nextLine();

                amount += total;
                
                System.out.println("New amount  : " + amount);
                
            }
            else {
                System.out.println("Invalid Transaction...");
            }
            
            
        }

        
        
    }
}
