import java.util.Scanner;
public class Calculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        System.out.println("1.Addition");
        System.out.println("2.Subtracion");
        System.out.println("3.Multiplaction");
        System.out.println("4.Division");
        int choice = sc.nextInt();
    
        

        switch(choice){
            case 1://Addition;
                   System.out.println(a+b);
                   break;
            case 2: //subtraction;
                   System.out.println(a-b);
                   break;
            case 3: //multiplication;
                   System.out.println(a*b);
                   break;
            case 4: //division;
                   System.out.println(a/b);
                   break;
            default: System.out.print("invalid choice");

            
        }
    }
}