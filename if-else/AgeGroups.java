import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age <= 10){
            System.out.println("you are a Child");
        }else if(age <= 17){
            System.out.println("teen");
        }else if(age <= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}
