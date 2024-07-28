import java.util.Scanner;

public class MaxORMin {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int [] arr = {15,20,4,66,45,78};


        int max = Maximum(arr);
        System.out.println("Maximum value is: " +max);
        int min = Minimum(arr);
        System.out.println("Minimum value is : " +min);

    }
    public static int Maximum(int []arr){
        int max = arr[0];
        int i = 1;
        while(i< arr.length){
            if(arr[i]>max){
                max = arr[i];
            }i++;
        }
        return max;
    }
    public static int Minimum(int []arr){
        int min = arr[0];
        int i = 1;
        while(i < arr.length){
            if(arr[i]<min){
                min = arr[i];
            }i++;
        }
        return min;
    }
}
