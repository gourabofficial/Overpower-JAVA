import java.util.Scanner;

public class GuessingGame {
    public static int Guess(){
        double random = Math.random() * 100;
      return (int) Math.ceil(random);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome to Guessing Game ,guess the number 1-100");
        int number;
        int randomNum = Guess();
        do{
            System.out.print("Please guess your number: ");
             number = sc.nextInt();
             if(randomNum > number){
                 System.out.println("its to low! Try Again");
             }else if (randomNum < number){
                 System.out.println("its to high! Try Again");
             }else{
                 System.out.println("Congratulations! You Guess the number");
             }
        }while(number!= randomNum);

    }
}