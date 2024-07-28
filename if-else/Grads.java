import java.util.Scanner;

public class Grads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your percentage: ");
        int percentage = input.nextInt();

        if(percentage >= 90){
            System.out.println("Grade: A ");
        }else if(percentage >= 80){
            System.out.println("Grade: B");
        }else if(percentage >= 50){
            System.out.println("Grade: C");
        }else if(percentage >= 40){
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
