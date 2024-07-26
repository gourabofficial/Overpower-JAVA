
import java.util.Scanner;

public class throwExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        int result;

        try {
            if (b == 0) {
                throw new ArithmeticException("can't devide by zero");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            result = a/b;
            System.out.println(result);
        }catch(ArithmeticException exception){
            System.out.println("enter the right value");
        }
    }
}
