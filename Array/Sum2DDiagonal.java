public class Sum2DDiagonal {
    public static void main(String[] args) {
        int [][]arr = ArrayUtility.input2DArray();
        long  sum = SumOfDiagonal(arr);
        System.out.println("Sum is : " + sum);
    }
    public static long SumOfDiagonal(int[][]arr){
        long lSum = Leftsum(arr);
        long rSum = RightSum(arr);
        long sum = lSum + rSum ;

        if(arr.length % 2 != 0){
            int index = arr.length/2;
            sum -= arr[index][index];
        }
          return sum;
    }
    public static long Leftsum (int [][]arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
    public static long RightSum(int[][]arr){
     long sum = 0;
     int i = 0;
     while(i < arr.length){
         int col = arr.length - 1 - i ;
         sum += arr[i][col];
         i++;
     }
     return sum;

    }
}
