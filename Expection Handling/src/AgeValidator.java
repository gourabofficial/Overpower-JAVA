import java.util.Scanner;

public class AgeValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            try {
                vote(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } finally {
            sc.close(); // Ensures the Scanner resource is closed
        }
    }

    public static void vote(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}
