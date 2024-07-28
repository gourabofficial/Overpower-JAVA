import java.util.Scanner;

public class Occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr  = ArrayUtility.inputArray();
        System.out.print("Enter the element you want to search: ");
        int num  = sc.nextInt();
        int number =  Occ(numArr,num);
        System.out.println("Your element is found "  +number+  " time in the array");

    }
    public static int Occ(int []num, int number){
        int occ = 0;
        int i = 0;
        while(i<num.length){
            if(num[i] == number){
                occ++;
            }
            i++;

        }
        return occ;
    }
}
