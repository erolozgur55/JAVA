package JavaExample.AbstractMetod._Odev1_;

public  class Main {
    public static void main(String[] args) {
        Tigers t =new Tigers();
        System.out.println(t.getClass().getSimpleName());
        t.setWalk();
        System.out.println( t.talk());
        System.out.println("***********************");

        Lions l=new Lions();
        System.out.println(l.getClass().getSimpleName());
        l.setWalk();
        System.out.println(l.talk());
        System.out.println("***********************");

        HometCats Hc=new HometCats();
        System.out.println(Hc.getClass().getSimpleName());
        Hc.setWalk();
        System.out.println(Hc.talk());
        System.out.println("***********************");








    }
}

