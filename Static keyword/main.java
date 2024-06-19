
//import static mypakage.a.main.testing;
public class main {
    public static void main(String[] args) {
        car obj1 = new car("Maruti");
        System.out.println(obj1.name);
        System.out.println(obj1.color);

        motorBike obj2 = new motorBike("R1V","bule");
        System.out.println(obj2.name);
        System.out.println(obj2.color);
        System.out.println(obj2.speed);


//        testing();
    }
}
class car{
    String name;
    String color;

    car(String name){
        color = "black";
        this.name = name;
    }
}
class motorBike{

    String name;
    String color;
    double speed;

    motorBike(String name, String color){
        speed = 170.90;
        this.name = name;
        this.color = color;
    }
}
