package org.example.DataGenerator;

import java.util.Random;

public class PhoneGenerator {
    public String PhoneGen(){
        String[] pres={"093","089","070","078","079","077","076"};
        String phone ="";
        Random rnd = new Random();
        int i=rnd.nextInt(pres.length);
        int pos = rnd.nextInt(9999999)+1000000;
        phone+=pres[i]+Integer.toString(pos);
        return phone;
    }
    public static void main(String args[]){
        PhoneGenerator pg = new PhoneGenerator();
        System.out.println(pg.PhoneGen());
    }
}
