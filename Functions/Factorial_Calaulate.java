import java.util.Scanner;

public class Factorial_Calaulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Digit: ");
        int number = sc .nextInt();
        int result = Factorial(number);
        System.out.println(result);
    }
    public static int Factorial(int n){
        // f = f*n;
        int factorial = 0;
        for(int i=0; i<=n; i++){
            factorial = factorial+i;

        }
        return factorial;
    }
}
