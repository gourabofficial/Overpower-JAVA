import java.util.Scanner;
public class Fibonacci{
    public static int Fibonacci_series(int n){
        if(n == 1   || n == 2)
        return 1;
        else
        return Fibonacci_series(n-1)+Fibonacci_series(n-2);

    }
    public static void main(String args[]){
        System.out.print("Enter the series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Fibonscci series: ");
        for(int i = 1; i <= n; i++ ){
        System.out.print(Fibonacci_series(i)+ " ");
        
        
       }
    }
 }


