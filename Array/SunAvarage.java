import java.util.Scanner;

public class SunAvarage {
    public static void main(String[] args) {
        int [] num = ArrayUtility.inputArray();
        long sum = sum(num);
        System.out.println("Sum is : " + sum);
        double avarage = avarage(num);
        System.out.println("Avarage is : "+avarage);
    }

    public static long sum(int[] num) {
        long sum = 0;
        int i = 0;
        while (i < num.length) {
            sum += num[i];
            i++;
        }
        return sum;
    }
    public static double avarage(int[] num){
        double avarage = sum(num)/num.length;
         return avarage;
        }

}

