import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your element : ");
        int number = sc.nextInt();
        for(int i=1; i<=number; i++) {
            System.out.print(Fibonacci(i) +" ");
        }
    }
    public static int Fibonacci(int pos ){
        if(pos == 1){
            return 0;
        }if(pos == 2){
            return 1;
        }else{
            return Fibonacci(pos - 1) + Fibonacci(pos - 2);
        }
    }
}
