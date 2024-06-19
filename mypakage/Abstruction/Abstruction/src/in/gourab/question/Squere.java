package in.gourab.question;

public class Squere extends Shape{
    private final double side;

    public Squere(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public double  CalculateArea(){
        return side * side;
    }
}
