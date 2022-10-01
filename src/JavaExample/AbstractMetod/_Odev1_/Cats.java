package JavaExample.AbstractMetod._Odev1_;

public abstract class Cats {
    String walk;
    String talk;
    public abstract String talk();

    public String getWalk() {return walk;}

    public String getTalk() {return talk;}

    public void setWalk(){
        System.out.println("Cat is walking.");
    }
}
