import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{
           System.out.print("Enter two number: ");
           int a = sc.nextInt();
           int b = sc.nextInt();
           int result =  a/b;
           System.out.println("Result is: " + result);
        }catch (ArithmeticException exception){
           System.out.println(exception.getMessage());
       }
    }
}
