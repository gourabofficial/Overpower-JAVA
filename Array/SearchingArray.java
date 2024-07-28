import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter your number for searching: ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("your number found in this array");
        }else{
            System.out.println("your number is not found in this array");
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if (arr[index] == num){

                return true;
           }  index++;
        }
        return false;
    }
}
