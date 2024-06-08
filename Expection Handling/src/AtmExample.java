import java.util.Scanner;

public class AtmExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        System.out.print("enter your withdraw amount:  ");
        int withdrawBalance = sc.nextInt();

        try{
            if(balance < withdrawBalance) {
                throw new ArithmeticException("Insafision balance");
            }
                balance -= withdrawBalance;
                System.out.println(balance);
                System.out.println("Transection Succesfully");

        }catch(ArithmeticException e ){
            System.out.println("exception: " + e.getMessage());
        }
    }
}

