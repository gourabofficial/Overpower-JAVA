
import java.util.Scanner;

public class BITWISEEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        //int  num = sc.nextInt();
        int num = sc.nextInt();
        if((num & 1) == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }

    }
}
