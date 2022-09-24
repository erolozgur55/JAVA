package Method_Overloading_Calculator;

import java.util.Scanner;


public class Main {
    public static int Extraction(int a,int b) {
        
        return (a - b);
        

    }
    public static double Division(int a,int b) {
        return ((double)a / b);
        
    }
    public static int ToCollect(int a,int b){
        
        return (a + b);
        
    }
    public static int  ToCollect(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int Multiplication(int a,int b) {
        
        return a * b;
    }
    public static int Multiplication(int a,int b,int c) {
        return a * b * c;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String transactions = "1. To collect \n"
                             + "2. Extraction\n"
                             + "3. Multiplication\n"
                             + "4. Division\n"
                             + " Press A to Exit";
        System.out.println("****************************************");
        System.out.println(transactions);
        System.out.println("****************************************");

        while (true) {
            System.out.print("Please Select Transaction : ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("q")){
                
                System.out.println("Exiting The Program....");
                break;
            }
            else if (transaction.equals("1")) {
                System.out.print("How many numbers should we collect? ? (2 or 3): ");
                
                int howManyNumber = scanner.nextInt();
                
                if (howManyNumber == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sums of entered numbers : " + (ToCollect(a, b)));
                    
                    
                }
                else if (howManyNumber == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sums of entered numbers : " + (ToCollect(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("No method found for this....");
                }
                
                
            }
            else if (transaction.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Entered Numbers Differences : " + Extraction(a, b));
                
            }

            else if (transaction.equals("3")){
                System.out.print("How many values will you multiply?? (2 or 3): ");
                
                int howManyNumber = scanner.nextInt();
                
                if (howManyNumber == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Multiplications of entered numbers : " + (Multiplication(a, b)));
                    
                    
                }
                else if (howManyNumber == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Multiplications of entered numbers : " + (Multiplication(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("No method found for this...");
                }
                
            }
            else if (transaction.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Division of Entered Numbers : " + Division(a, b));
                
            }
            else {
                System.out.println("Invalid Transaction...");
            }
            
            
            
        }
        
        
    }
}
