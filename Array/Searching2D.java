import java.util.Scanner;

public class Searching2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = ArrayUtility.input2DArray();
        System.out.print("now enter the element you search: ");
        int element = sc.nextInt();
        boolean isfound = SearchElement(arr,element);
        if(isfound){
            System.out.println("Your number is Found in this array");
        }else{
            System.out.println("Your number is not Found ");
        }
    }
    public static boolean SearchElement(int [][] arr, int num){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == num){
                  return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
