import java.util.Scanner;

public class Rectengle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breath: ");
        int b = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();

        double result = (1.0/2) * b * h;
        System.out.println("Area of rectengle is : "+result);
    }
}
