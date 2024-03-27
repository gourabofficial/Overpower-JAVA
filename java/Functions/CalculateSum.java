import java.util.Scanner;
public class CalculateSum{
    public static int calculate_sum(int a,int b){
         int sum = a+b;
         return sum;
}
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Number: ");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int sum = calculate_sum(m,n);
    System.out.println("sum is : "+ sum);
  }
}

   