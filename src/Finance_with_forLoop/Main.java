package Finance_with_forLoop;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*todo
            Interest Application
              How many years maturity does the user want to deposit the principal value and money?
              Get the information and print the total amount of money on the screen at the end of each year.
                            Interest Rate: 8% Interest Rate
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Bank. Interest Rate 8%");
        
        int principal,maturity;
        System.out.print("The amount you want to deposit : ");
        principal = scanner.nextInt();
        System.out.print("How many years do you want to invest your money ? ");
        maturity = scanner.nextInt();
        
        double totalmoney = principal;
        double interestrate = 0.08;
        
        for (int i =  1 ;  i<= maturity ; i++) {

            totalmoney = (totalmoney * interestrate) + totalmoney;
            
            System.out.println(i + ".total money at the end of the year : " + (int)totalmoney);
            
            
        }
        
        
        
    }
}
