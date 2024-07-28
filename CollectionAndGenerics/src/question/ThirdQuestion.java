package question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdQuestion {
    public static void main(String[] args) {
        List <Integer> num = Arrays.asList(10,20,30,1,3);
        System.out.println("my list is "+num);
        System.out.println("After swapping index 0 and 1");
        swapNum(num,0,1);
    }
    public static void swapNum(List <Integer> num,int a,int b){
        Collections.swap(num,a,b);
        System.out.println(num);

    }
}
