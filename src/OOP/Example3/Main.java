package OOP.Example3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner sayi = new Scanner(System.in);
        ArrayList<Subscribe> subscribeArrayList = new ArrayList<>();

        System.out.print("Please enter your name = ");
        String name = oku.next();
        System.out.print("Want to Prefer Membership? ? Yes/No = ");
        String tercih = oku.next();
        if (tercih.equalsIgnoreCase("Yes")) {
            System.out.println("Select 1 for Gold Membership \nChoose 2 for Silver Membership\nChoose 3 for Bronze Membership ");
            System.out.print("Which one do you prefer ? \nPlease specify in numbers = ");
            int tercih1 = sayi.nextInt();
            if (tercih1 == 1) {
                subscribeArrayList.add(new Subscribe(name, true, 1));
            } else if (tercih1 == 2) {
                subscribeArrayList.add(new Subscribe(name, true, 2));
            } else if (tercih1 == 3) {
                subscribeArrayList.add(new Subscribe(name, true, 3));
            }
            System.out.println("Your preference status = " + subscribeArrayList);
        } else if (tercih.equalsIgnoreCase("Hayir")) {
            System.out.println("Take care, see you again soon...");

        }
    }
}