import java.util.Scanner;

public class PrimeorNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = CheckPrime(num);
        if(result){
            System.out.print("number is prime");
        }else{
            System.out.print("number is not prime");
        }

    }
    public static boolean CheckPrime(int number){
        int i = 2;
        while(i < number){
            if(number % i == 0){
                return false;
            }
            i++;
        }
            return true;
    }
}