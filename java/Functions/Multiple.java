import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = input.nextInt();
        multiple(num);
    }
    public static void multiple(int number) {
        for (int i=1; i<=10; i++){
            System.out.println(number + "*" + i + " = " + (number*i));
        }
      }
    }

