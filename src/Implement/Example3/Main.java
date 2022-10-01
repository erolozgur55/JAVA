package Implement.Example3;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(40);
        bicycle.speedUp(50);
        bicycle.changeGear(2);
        bicycle.applyBrakes(5);
        bicycle.changeGear(21);



        System.out.println(bicycle.getClass().getSimpleName());
        bicycle.printAll();
        System.out.println("*********************************" );

        Car car = new Car(100);
        car.speedUp(80);
        car.changeGear(3);
        car.applyBrakes(40);
        car.changeGear(6);
        System.out.println(car.getClass().getSimpleName());
        car.printAll();
        System.out.println("*********************************" );




    }
}
