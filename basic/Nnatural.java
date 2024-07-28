import java.util.Scanner;

public class Nnatural{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter your number for sum : ");
        number = input.nextInt();
        int result =( number*(number +1))/2;
        System.out.println("First n natural number sum is : "+result);

    }
}