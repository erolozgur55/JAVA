package OOP.Example4;

public class Main {
    public static void main(String[] args) {
        rentApartments room = new rentApartments("Erol Ozgur", 0, false);

        System.out.println("Room Rental Fee Without Balcony = " + room);

        rentApartments room1 = new rentApartments("Eray Ozgur", 1, true);

        System.out.println("No. 1 Room with Balcony Rental Fee = " + room1);

        rentApartments room2 = new rentApartments("Erol Ozgur", 2, true);

        System.out.println("No. 2 Room with Balcony Rental Fee= " + room2);

        rentApartments room3 = new rentApartments("Eray Ozgur", 0, false);

        System.out.println("No. 3 Room with Balcony Rental Fee = " + room3);



    }
}
