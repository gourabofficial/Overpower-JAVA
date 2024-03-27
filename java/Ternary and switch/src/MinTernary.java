import java.util.Scanner;

public class MinTernary {
    public static void main(String[] args) {
        System.out.println("please enter your number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        int minimun = a > b ? b : a;
        System.out.println(minimun);

    }
}
