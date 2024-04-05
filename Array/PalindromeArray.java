public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean result = isPalindrome(arr);
        if(result) {
            System.out.println("Your array is palindrome");
        }else{
            System.out.println("Your Array is Not Palindrome");
        }
    }
    public static boolean isPalindrome(int []arr){
        int i = 0;
        while( i < arr.length){
            if (arr[i]!= arr[(arr.length - 1 )- i]){
                return false;
            }i++;
        }
        return true;
    }
}
