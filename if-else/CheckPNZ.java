import java.util.Scanner;

public class CheckPNZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int number = input.nextInt();

        if(number>0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
    }
}
