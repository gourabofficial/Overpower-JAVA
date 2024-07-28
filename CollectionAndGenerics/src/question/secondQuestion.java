package question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondQuestion {
    public static void main(String[] args) {
        List <Integer> num = Arrays.asList(1,2,3,1,3,2,1,2,2,2,3,4,5,6,6,6);
        System.out.println("1 in " +Collections.frequency(num,1)+ " times");  //frequency: how many time there is a number
        System.out.println("2 in " + Collections.frequency(num,2)+" times");
        System.out.println("6 is "+Collections.frequency(num,6)+" times");
    }
}
