import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum Odd Calculator");
        System.out.print("enter your number: ");
        int num = input.nextInt();
       int result =  SumOdd(num);
        System.out.println("sum of " + num + " odd number is: " + result);
    }
    public static int SumOdd(int n){
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

