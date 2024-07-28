import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {

         String password ;
        do{
            System.out.print("Enter your valid password: ");
            Scanner sc = new Scanner(System.in);
            password = sc.next();
        }while(isCorrect(password));
        System.out.println("Greate!your password is correct");

    }
    public static boolean isCorrect(String pass){
        return pass.length()>8;
    }
}

