import java.util.Scanner;

public class EvenContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        for(int i = 0; i<number; i+=2){
            if(number % 2 != 0){
                continue;

            }
            System.out.println(i);
        }
    }
}
