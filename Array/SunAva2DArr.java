public class SunAva2DArr {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        int sum = Sum(arr);
        System.out.println("Sum is: " + sum);
        double avarage = Avarage(arr);
        System.out.println("Avarage is : " +avarage);

    }
    public static int Sum(int[][]arr){
        int i = 0;
        int sum = 0;
        while (i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }i++;

        }
        return sum;
    }
    public static double Avarage(int [][]arr){
        double avarage = (double)Sum(arr)/arr.length;
        return avarage;
    }
}
