import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int first = sc.nextInt();
        System.out.print("please enter your second number: ");
        int second = sc.nextInt();
        int lcm = Calculate_Lcm(first,second);
        System.out.print("Lcm of two number is: " +lcm);
    }
    public static int Calculate_Lcm(int first , int second){
        int factor;
        for(int i=1; i<=second; i++){
            factor = first*i;
            if(factor%second == 0){
                return factor;
            }
        }
       return 0;
    }
}
