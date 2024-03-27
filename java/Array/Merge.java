public class Merge {
    public static void main(String[] args) {
        int []arr1 =ArrayUtility.inputArray();
        int []arr2 = ArrayUtility.inputArray();
        int [] merge = MergeSort(arr1,arr2);
        System.out.println("After Merging:  ");
        ArrayUtility.DisplayArray(merge);
    }
   public static int[] MergeSort(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int size = arr1.length + arr2.length;
        int [] newArr = new int [size];

        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
   }
}
