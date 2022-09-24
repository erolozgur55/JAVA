package WhileMethod_UserLogin;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // todo =  It is the process of writing a user Login with the help of a while loop.
        
        Scanner scanner = new Scanner(System.in);
        
        int your_right_of_entry = 3;
        
        String UserName = "Erol Ozgur";
        String Password = "951753erl";
        
        System.out.println("*****************************");
        System.out.println("Welcome to User Login ...");
        System.out.println("*****************************");
        
        while (true) {
            System.out.print("User Name  : ");
            String User = scanner.nextLine();
            System.out.print("Password : ");
            String yourPassword = scanner.nextLine();
            
            if (User.equals(UserName) && yourPassword.equals(Password)) {
                System.out.println("Welcome, " + User);
                break;
            }
            else if (User.equals(UserName) && !yourPassword.equals(Password)) {
                
                System.out.println("Password Incorrect...");
                your_right_of_entry -= 1;
                
                System.out.println("your_right_of_entry: " + your_right_of_entry);
                
                
            }
            else if (!User.equals(UserName) && yourPassword.equals(Password)) {
                
                System.out.println("User Name Incorrect ...");
                your_right_of_entry -= 1;
                System.out.println("your_right_of_entry : " + your_right_of_entry);

                
            }
            else {
                System.out.println("Your Username and Password are Incorrect...");

                your_right_of_entry -= 1;
                System.out.println("your_right_of_entry : " + your_right_of_entry);

                
            }
            if (your_right_of_entry == 0){
                
                System.out.println("Your Right of Entry Finished. We hope you come again....");
                break;
            }
           
        }
    }
}
