public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean isInc = isIncrease(arr);
        boolean isDec = isDecrease(arr);
        if(isInc || isDec){
            System.out.println("Sorted Array");
        }else{
            System.out.println("Array is not Sorted ");
        }

    }
    public static boolean isIncrease(int [] arr){
        int i = 1;
        while(i<arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecrease(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
