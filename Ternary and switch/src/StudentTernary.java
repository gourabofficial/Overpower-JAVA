import java.util.Scanner;

public class StudentTernary {
    public static void main(String[] args) {
        System.out.print("please enter your Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String result = marks >= 80 ? "High" : (marks >= 50 ? "Modetare" : "Lowest");
        System.out.println(result);
    }
}
