package in.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class firstExample {
    public static void main(String[] args) {
        List <String> strlist = new ArrayList <>(); // syntex of list

        strlist.add("Gourab");
        strlist.add("Ganguly");
        strlist.add(1,"Kr");
        System.out.println("index is: " +strlist.indexOf("Gourab"));
        if(strlist.contains("gourab")){
            System.out.println("yes its hear");

        }else{
            System.out.println("no its not hear");
        }


        for (String i : strlist) {
            System.out.println(i);
        }
    }
}
