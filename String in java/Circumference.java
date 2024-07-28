import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI*Math.pow(radius,2);   //PI*R^2;
        double circumference = 2*Math.PI*radius;     //2*PI*radius

        System.out.println("Area of the circle: " + area);
        System.out.println("circumference of circle:" + circumference);

    }
}
