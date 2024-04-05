import java.util.Scanner;
public class OddSum{
    public static int sum_odd(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
        
    }
    public static void main(String args []){
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int result = sum_odd(n);
       System.out.println("sum of "+ n + " odd number: "+ result);
     
    }
}

     
    
