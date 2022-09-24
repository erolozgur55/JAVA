package Holiday_programming;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Welcome to Sydney Airport....");
        
        String conditions = "Overseas Departure Rules...\n"
                         +"There Should be no political problems....\n"
                         +"You must pay an exit fee of 100AU$....\n"
                         +"Must have a visa for the country of destination....";
        String message = "You must meet all of these rules.";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(conditions);
            System.out.println("*******************************************");


            Passenger passenger = new Passenger();
            
            System.out.println("Check-out fee....");
            
            Thread.sleep(3000);
            if (passenger.visaFees() == false) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("The political situation is controlled....");
            Thread.sleep(3000);
            
            if (passenger.politicalProblem() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Checking Visa Status...");
            Thread.sleep(3000);
            
            if (passenger.VisaCheck() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Your transactions are OK! Have a nice flight....");
            break;
            
            
        }
        
        
    }
}
