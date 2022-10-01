package OOP.Example2;

public class Main {
    public static void main(String[] args) {

        Employees calisan = new Employees("Fernando", 80000, "11/23/2000");

        if (calisan.ageCalculator() > 18) {
            System.out.println("Welcome to our company Fernando your salary is 80000.");
        } else if (calisan.ageCalculator() < 18) {
            System.out.println("come back when you are 18 years old.");
        } else if (calisan.ageCalculator() == 18) {
            System.out.println("we can have inter with you after that you can have a 80000 salary");


        }
    }
}
