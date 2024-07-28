import java.util.Scanner;

public class ForPrimeorNot {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        boolean result = isprime(number);
        if(result){
            System.out.println("prime number");
        }else{
            System.out.println("Not prime");
        }

    }
    public static boolean isprime(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
