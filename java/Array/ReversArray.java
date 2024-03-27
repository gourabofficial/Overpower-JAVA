public class ReversArray {
    public static void main(String[] args) {
       int arr[] =  ArrayUtility.inputArray();
        ReversArr(arr);
        System.out.println("Your revers Array is: ");
       ArrayUtility.DisplayArray(arr);
    }
    public static void ReversArr(int arr[]){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i]=arr[(arr.length - 1 )- i];
            arr[(arr.length - 1 )-i] = swap;
            i++;
        }
    }
}
