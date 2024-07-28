import java.util.Scanner;
public class Vote{
    public static void vote_Elegible(int age){
        if(age >= 18){
            System.out.println("Elegible for vote");
        }else
        System.out.println("Not Elegible for vote");
    }
    

public static void main(String args[]){

    System.out.println("Enter your Age : ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    vote_Elegible(age);
    
  }
}