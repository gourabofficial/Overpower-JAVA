import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter your number for check its primt or not !");
        Scanner sc = new Scanner(System.in);
        int number = sc. nextInt();

        for (int i=1; i<=number; i++){
            if(number%i == 0){
               count++; 
             
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else
        System.out.println("Not Prime");
    

        }
}


