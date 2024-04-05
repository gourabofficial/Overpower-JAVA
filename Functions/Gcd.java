import java.util.Scanner;
public class Gcd{
    public static int calculate_gcd(int a,int b){
        if(a==b)
        return a;
        if(a%b == 0)
        return b;
        if(b%a == 0)
            return a;
        if(a > b)
        return calculate_gcd (a%b , b);
        else
        return calculate_gcd (a , b%a);
    }
    public static void main(String args[]){
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculate_gcd (a,b);
        System.out.println("gcd is : "+result);
    }
}