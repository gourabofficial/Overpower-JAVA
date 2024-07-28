import java.util.Scanner;
public class Grate{
    public static int greater_number(int a, int b){
        if (a>b)
        return a;
        else
        return b;
    }
    public static void main(String args[]){
        System.out.println("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int result = greater_number(a,b);
        System.out .println("Greater is : "+result);
    }
}