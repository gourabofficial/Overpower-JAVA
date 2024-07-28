import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int first = Add_number();// call the Add_number() function and store the value in first variable
        int second =  Add_number();//same
        int sum = first + second;
        System.out.println("sum is : "+ sum);
    }
    public static int Add_number(){
        Scanner input = new Scanner(System.in);  //scanner function
        System.out.print("Please enter your Number: "); // user input
        int number = input.nextInt(); // user input and store the value in number variable
        return number; // finaly return the value in main function
    }
}
