import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the valu of A: ");
        int a = input. nextInt();
        System.err.print("Enter the value of B: ");
        int b = input. nextInt();

        
        int c = a; 
        a = b;
        b = c;

        System.out.println("Swaping done...");
        System.out.println("After swaping the value of A is: "+a+ " And B is: " +b);
      
    }
    
}
