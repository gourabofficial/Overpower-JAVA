import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        System.out.println("please enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = num >= 0 ? num : -num ;
        System.out.println( " Absolute value :  "+result);
    }
}
