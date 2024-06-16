import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        System.out.println("Division calculatar");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = sc.nextInt();
        try{
            int result = num1/num2;
            System.out.print("result is : " + result);
        } catch (ArithmeticException division){
            System.out.println("Devide by zero , enter valid number ");
        }

    }
}
