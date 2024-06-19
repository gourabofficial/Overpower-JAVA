package in.gourab.question;

public class Circle extends Shape{
    private final double redius;

    public Circle(int redius) {
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }
    public double  CalculateArea(){
        return Math.PI * redius * redius;
    }
}
