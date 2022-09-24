package Holiday_programming;
import java.util.Scanner;


public class Passenger implements AbroadRules {
    
    private int visaFees;
    private boolean politicalProblem;
    private boolean VisaCheck;
    
    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Visa fee deposited : ");
        this.visaFees = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Do you have any political bans? ( Yes or No ) ? ");
        
        String answer = scanner.nextLine();

        if (answer.equals("Yes")) {

            this.politicalProblem = true;
        }
        else {
            this.politicalProblem = false;
        }
        System.out.print("Do you have visa ? ( Yes or No ) ?");
        
        String answer1 = scanner.nextLine();

        if (answer1.equals("Yes") ){
            this.VisaCheck = true;

        }
        else {
            this.VisaCheck = false;
        }
        
        
        
        
        
    }

    @Override
    public boolean visaFees() {
        if (this.visaFees < 15) {
            
            System.out.println("Please pay the departure international departure fee....");
            return false;
        }
        else {
            System.out.println("Payment complete.!");
            return true;
        }
    }

    @Override
    public boolean politicalProblem() {
        
        if (this.politicalProblem) {
            System.out.println("You have a political problem..You cannot go abroad....");
            return false;
        }
        else {
            System.out.println("You don't have a political problem....");
            return true;
        }
    }

    @Override
    public boolean VisaCheck() {
        if (this.VisaCheck) {
            
            System.out.println("Your visa process is complete.!");
            return true;
        }
        else {
            System.out.println("Your visa is not available to the country you are going to....");
            return false;
        }

    }


    @Override
    public boolean ForeignFees() {
        return false;
    }

    @Override
    public boolean politicalControl() {
        return false;
    }

    @Override
    public boolean visaCheck() {
        return false;
    }
}
