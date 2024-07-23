import java.util.Scanner;

public class EmailExample {
    public static void validEmail(String email){
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Invalid Email Address");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid email: ");
        String email = sc.nextLine();
        try {
            validEmail(email); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
      }
    }


