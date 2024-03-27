import java.util.Scanner;

public class Test {
 public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your age and name: ");
    int age = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();


    
    System.out.println("name is: " +name+" "+ "Age is : "+age);

 }
}
