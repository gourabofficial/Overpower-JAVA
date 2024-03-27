import java.util.Scanner;

public class EorOTernary {
    public static void main(String[] args) {
        System.out.println("please enter your number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        String result = (a % 2 == 0) ? "Even" : "Odd";
                System.out.println(result);
    }
}
