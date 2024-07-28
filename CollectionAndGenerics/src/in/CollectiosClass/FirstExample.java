package in.CollectiosClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(2);
        num.add(10);
        num.add(6);
        num.add(44);
        num.add(-18);

        System.out.println();

        System.out.print("The Number: ");
        for(Integer i : num){
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.sort(num);

        System.out.print("After sorted: ");
        for(Integer i : num){
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.reverse(num);
        System.out.print("After reverse: ");
        for(Integer i : num){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The max number is: " + Collections.max(num));
        System.out.println("The min number is: " + Collections.min(num));

        System.out.println();


    }

}



