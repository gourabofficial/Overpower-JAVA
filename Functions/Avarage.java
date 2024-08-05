import java.util.Scanner;
public class Avarage{
   public static int avarage_number(int a ,int b, int c){
    int Avarage = (a+b+c)/3;
    return Avarage;
   }


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three number: ");
    int a = sc.nextInt();
    int b = sc. nextInt();
    int c = sc. nextInt();
    int result = avarage_number(a,b,c);
    System.out.println("avarage is :"+ result);

    }
}