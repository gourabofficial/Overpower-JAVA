package in.gourab.Util;

import in.gourab.Geomatry.Circle;
import in.gourab.Geomatry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.55);
         Rectangle rectangle = new Rectangle(4.65, 6);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rect = rectangle. length * rectangle.breadth ;

        System.out.printf("circle radius: %f \narea of rectangle: %f",cirArea,rect);
    }
}
