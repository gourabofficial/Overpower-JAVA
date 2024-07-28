import java.util.Scanner;
public class Firstarray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] num = new int [size];
         
         System.out.println("Enter the Element: ");
        for(int i = 0; i<size; i++){
            num[i] = sc.nextInt();

        }
         System.out.println("Enter the searching Element:  ");
        int x =  sc.nextInt();
        for (int i = 1; i< size; i++){
            if (num[i] == x){
                System.out.println("Element found in " + i + " index " );
            
        }
        }
   }
}