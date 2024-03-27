import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int arr [] = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element : ");
        int deleteNum = sc.nextInt();
        int[] result = deleteElement( arr,deleteNum  );
        ArrayUtility.DisplayArray(result);
    }

        public static int[] deleteElement(int[] arr, int element) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    count++;
                }
            }

            int[] newArr = new int[arr.length - count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != element) {
                    newArr[index] = arr[i];
                    index++;
                }
            }
            return newArr;
        }

    }



