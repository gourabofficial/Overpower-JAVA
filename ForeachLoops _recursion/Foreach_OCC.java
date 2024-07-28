import java.util.Scanner;

public class Foreach_OCC {
    public static void main(String[] args) {
        int []arr = ArrayUtility2.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you Search: ");
        int SearchElement = sc.nextInt();

        int occ = 0;
        for(int num : arr){
            if(num == SearchElement){
              occ++;
            }
        }
        System.out.println(SearchElement + " number is "+ occ + " times in the Array " );
    }

}
