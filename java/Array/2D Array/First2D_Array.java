import java.util.Scanner;


public class First2D_Array {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     int rows = sc.nextInt();
     int coll = sc.nextInt();

     int[][] number  = new int [rows][coll];

     //input
     for (int i=0; i<rows; i++){
        for (int j=0; j<coll; j++){
            number [i][j] = sc.nextInt();

        }
     } //output
     for(int i=0; i<rows; i++){
        for(int j=0; j<coll; j++){
            System.out.print(number[i][j] + " ");

        }System.out.println();
     }
    }
    
}
