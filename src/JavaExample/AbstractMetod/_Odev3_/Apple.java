package JavaExample.AbstractMetod._Odev3_;

public class Apple extends Phone{
    @Override
    public void options(String including, String size) {
        if (including.contains("64") && size.contains("5.5")) {
            cart.add("$750");
        } else if (including.contains("64") && size.contains("6.5")) {
            cart.add("$850");
        } else if (including.contains("128") && size.contains("5.5")) {
            cart.add("$950");
        } else if (including.contains("128") && size.contains("6.5")) {
            cart.add("$1200");
        }
    }
}

