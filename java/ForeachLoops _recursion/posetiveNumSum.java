import java.util.Scanner;

public class posetiveNumSum {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=number; i++){
            if(number < 0){
                continue;
            }
           sum = sum + i;

            System.out.println(sum);
        }
    }
}
