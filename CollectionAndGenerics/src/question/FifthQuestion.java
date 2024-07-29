package question;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//unique charactor count using set
public class FifthQuestion {
    public static void main(String[] args) {
        Set <Character> userstr = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String str = sc.next();

        for(char ch : str.toCharArray()) {
            userstr.add(ch);
        }
        System.out.println("Unique charactor count: " + userstr.size());
    }
}
