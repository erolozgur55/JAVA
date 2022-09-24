package Professional.Grade.Calculator;

import java.util.Scanner;


public class Main {
    /*       TODO
              Try to make a letter calculation system by getting the Visa1, Visa2 and Final grades from the user.
              In addition, by taking the general average from the user in the school,
              Print an advisory message to the screen based on the condition of receiving DD and being below 2.50.
              Visa1 will affect 30% of the total grade.
              Visa2 will affect 30% of the total grade.
              The final will affect 40% of the total grade.
              Total Points >=  90 -----> AA
              Total Points>=  85 -----> BA
              Total Points >=  80 -----> BB
              Total Points >=  75 -----> CB
              Total Points >=  70 -----> CC
              Total Points >=  65 -----> DC
              Total Points >=  60 -----> DD
              Total Points >=  55 -----> FD
              Total Points <  55 -----> FF

    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Visa1 grade : ");
        int visa1  = scanner.nextInt();
        System.out.print("Visa2 grade : ");
        int visa2  = scanner.nextInt();
        System.out.print("Final grade  : ");
        int finalgrade  = scanner.nextInt();
        System.out.print("Your School Average:");
        double Average = scanner.nextDouble();
        
        double TotalPoints = (visa1 * 3 / 10.0) + (visa2 * 3 / 10.0) + (finalgrade * 4 / 10.0);
        
        if (TotalPoints >= 90) {
            
            System.out.println("You got AA...");
        }
        else if (TotalPoints >= 85) {
            System.out.println("You got BA...");
        }
        else if (TotalPoints >= 80) {
            System.out.println("You got BB ...");
        }
        else if (TotalPoints >= 75) {
            System.out.println("You got CB...");
        }
        else if (TotalPoints >= 70) {
            System.out.println("You got CC...");
        }
        else if (TotalPoints >= 65) {
            System.out.println("You got DC ...");
        }
        else if (TotalPoints >= 60) {
            System.out.println("You got DD ...");
            
            if (TotalPoints < 2.50) {
                
                System.out.println("You got a DD and Your grade point average is low.You may consider taking this lesson again..");
            }
        }
        else if (TotalPoints >= 55) {
            System.out.println("You got FD ve You stayed...");
        }
        else {
            System.out.println("You got FF ve You stayed...");
        }
        
    }
    
}
