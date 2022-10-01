package JavaExample.AbstractMetod._Odev3_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Please enter the 1st size you prefer = " );
        String str1=read.nextLine();
        System.out.print("Please enter the 2nd size you prefer= " );
        String str2= read.nextLine();
        System.out.println("***************************");
        Apple apple=new Apple();
        System.out.println(apple.getClass().getSimpleName());
        apple.options(str1,str2);

        System.out.print("Please enter your preferred 3rd size = " );
        String str3=read.nextLine();

        System.out.print("Please enter your preferred 4th size =  ");
        String str4=read.nextLine();
        System.out.println("***************************");
        Samsung samsung=new Samsung();
        System.out.println(samsung.getClass().getSimpleName());
        samsung.options(str3,str4);

        System.out.print("Value =" + Phone.getSum(Phone.cart));














    }
}
