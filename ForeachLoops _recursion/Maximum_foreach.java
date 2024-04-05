public class Maximum_foreach {
    public static void main(String[] args) {
     int[] arr = ArrayUtility2.inputArray();

     int max = Integer.MIN_VALUE;
     for(int num : arr) {
         if (max < num) {
             max = num;
         }
       }
        System.out.println("Maximum number is: " + max);
    }
}
