package JavaExample.AbstractMetod._Odev2_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.print(" Please Enter First Number= " );
        int a= read.nextInt();
        System.out.print(" Please Enter Second Number = " );
        int b=read.nextInt();

        System.out.println("***************************");
        Sum s=new Sum();
        System.out.println(s.getClass().getSimpleName());
        System.out.println("Addition operation(a+b) Your result = " + s.calculating(a,b));
        System.out.println("***************************");
        Substract st=new Substract();
        System.out.println(st.getClass().getSimpleName());
        System.out.println("Subtraction (a-b) Your Result= " + st.calculating(a,b));
        System.out.println("***************************");
        Divide d=new Divide();
        System.out.println(d.getClass().getSimpleName());
        System.out.println("Your division operation(a/b) result = " + d.calculating(a,b));
        System.out.println("***************************");
        Multiply mp=new Multiply();
        System.out.println(mp.getClass().getSimpleName());
        System.out.println("Multiplication operation(a*b) Your result = " + mp.calculating(a,b));





    }
}
