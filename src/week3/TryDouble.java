package week3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by coag on 24-09-2018.
 */
public class TryDouble {

    public static void main(String[] args) {
        double d = 0.1;
//
//        d+= 0.1;
//        d+= 0.1;
//        d+= .1;
//        d+= .1;
//        d+= .1;
//        d+= .1;
//        d+= .1;
//        d+= .1;
//        d+= .1;
//        System.out.println(d);

        double a = 0.1;
        double b = 0.2;
        double c = (a*10+b*10)/10;
        System.out.println(c);

        ArrayList<String> names = new ArrayList<>();
        names.add("alice");
        names.add("bob");
        names.add("david");

        if(names.contains("bob")){
            names.add("char");
        }

        System.out.println(names);
        ArrayList<String> tempList = new ArrayList<>();
        names.forEach(E->{
//            System.out.println(E.toUpperCase());
            String temp = E.toUpperCase();
            tempList.add(temp);
        });

        names = tempList;

        System.out.println(names);

//        for (String name: names){
//            if(name.equalsIgnoreCase("bob")){
//                names.add("char");
//            }
//        }
//
//        System.out.println(names);
//        for (int i=0; i<names.size(); i++){
//            if(names.get(i).equalsIgnoreCase("bob")){
//                names.add("bob");
//            }
//        }
//        System.out.println(names);
//



    }
}
