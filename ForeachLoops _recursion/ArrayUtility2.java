
    import java.util.Scanner;

import java.util.Scanner;

    public class ArrayUtility2 {
        public static int[] inputArray() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Array size: ");
            int size = sc.nextInt();
            int[] num = new int[size];

            int i = 0;
            while (i < size) {
                System.out.print("Enter your Element in position " + (i + 1) + " : ");
                num[i] = sc.nextInt();
                i++;
            }
            return num;
        }

        //Array display

        public static void DisplayArray(int[]arr){
            int i = 0;
            while(i < arr.length){
                System.out.println(arr[i]);
                i++;
            }
            System.out.println();
        }

        //2D array input

        public static int [][]input2DArray(){
            Scanner input  = new Scanner(System.in);
            System.out.print("Enter your rows Size: ");
            int rows = input.nextInt();
            System.out.print("Enter your columns Size:");
            int columns = input.nextInt();
            int [][] numArr =  new int [rows][columns];

            int i = 0;
            while(i < rows){
                int j = 0;
                while(j < columns){
                    System.out.print("please enter element rows " + (i+1)+ " and columns " +(j+1) + " :");
                    numArr[i][j] = input.nextInt();
                    j++;
                }
                i++;
            }
            return numArr;
        }
    }




