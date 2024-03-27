import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.print(a+"is greater");
        }else if(b>a && b>c ){
            System.out.print(b+"is greater");
        }else{
            System.out.print(c+"is greater");
        }
    }
}
