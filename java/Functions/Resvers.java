import java.util.Scanner;

public class Resvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int result = revers(num);
        System.out.println("Revers number: " + result);
    }

    public static int revers(int n) {
        int newNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            newNumber = newNumber * 10 + lastDigit;
            n = n / 10;
        }
            return newNumber;
        }
    }


