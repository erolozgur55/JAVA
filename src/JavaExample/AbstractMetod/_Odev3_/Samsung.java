package JavaExample.AbstractMetod._Odev3_;

public class Samsung extends Phone {
    @Override
    public void options(String including, String size) {
        if (including.contains("256") && size.contains("5.5")) {
            cart.add("$1000");
        } else if (including.contains("256") && size.contains("7.5")) {
            cart.add("$1200");
        } else if (including.contains("512") && size.contains("5.5")) {
            cart.add("$1300");
        } else if (including.contains("512") && size.contains("6.5")) {
            cart.add("$1400");
        }
    }
}
