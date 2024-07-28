package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class fourthQuestion {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10, 20, 30, 1, 3);
        System.out.println("List: " + num);
        reverseNum(num);
        System.out.println("Reverse: " + num);

    }
    public static void reverseNum(List<Integer> num){
        Collections.reverse(num);
    }
}
