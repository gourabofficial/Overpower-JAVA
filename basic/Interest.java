import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the price = ");
        int price = sc.nextInt();
        System.out.print("Enter the time: "); // number  = year;
        int time = sc.nextInt();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        double interest = (price*time*rate)/100 ;
        System.out.println("interest is : "+interest);

    }
}
