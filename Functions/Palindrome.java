import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        boolean result = isPalindrome(num);
        if(result){
            System.out.println("Your number is a Palindrome Number ");
        }else{
            System.out.println("Your number is a Palindrome number");
        }

    }
    public static boolean isPalindrome(int num){
           return num == Lastdigit(num);

    }
    public static int Lastdigit(int num){
        int newNum = 0;
        while(num > 0){
            int lastDigit = num%10;
            newNum = newNum * 10 + lastDigit;
            num = num/10;
        }
        return newNum;
    }
}
