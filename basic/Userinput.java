import java.util.Scanner;


public class Userinput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int firstNumber = input. nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = input. nextInt();

        
        int result = firstNumber + secondNumber; 
        System.out.println( "sum of 2 number is: "+result);
           

        }
        
    }


