package Implement.Example2;

import java.util.ArrayList;

public class MainZoo {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Duck duck = new Duck();
        Swallow swallow = new Swallow();
        Shark shark = new Shark();

        ArrayList<hayvanlar> animal = new ArrayList<>();
        animal.add(cat);
        System.out.println();
        animal.add(duck);
        animal.add(swallow);
        animal.add(shark);

        for (hayvanlar t : animal) {
            System.out.println(t.getClass().getSimpleName());
            System.out.println("***************************");
            System.out.println("Food : " + t.food());
            System.out.println();

        }
    }
}
