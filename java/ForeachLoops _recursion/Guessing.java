import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 7;
        int gues;
        do{
            System.out.print("please gues the number 1 to 10: ");
             gues = sc.nextInt();
        }while(number != gues);
            System.out.println("you gues Sucessfully");
    }
}
