import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter your number to find the mounth: ");
        Scanner sc = new Scanner(System.in);
         int mounth = sc.nextInt();

       String Mounth12  = switch (mounth){
             case 1 -> "January";
             case 2 -> "Febraury";
             case 3 -> "March";
             case 4 -> "April";
             case 5 -> "May";
             case 6 -> "June";
             case 7 -> "July";
             case 8 -> "August";
             case 9 -> "September";
             case 10 -> "October";
             case 11 -> "November";
             case 12 -> "December";
             default -> "invalid month";
         };
        System.out.println(Mounth12);
    }
}
