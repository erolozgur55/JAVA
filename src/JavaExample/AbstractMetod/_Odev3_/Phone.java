package JavaExample.AbstractMetod._Odev3_;

import java.util.ArrayList;

public abstract class Phone {

    public static ArrayList<String> cart=new ArrayList<>();

    public static int getSum(ArrayList<String> stringArrayList){
        int value=0;

        for (String d:stringArrayList) {
            int value1=Integer.parseInt(d.replaceAll("^[0-9-$]",""));

            value+=value1;


        }
        return value;

    }
    public abstract void options(String including,String size);

}

