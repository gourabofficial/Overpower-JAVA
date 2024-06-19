package in.gourab.learn;

public class car extends vehicle{


    public car(String name) {
        super(name);
    }

    public void Start() {
        System.out.println("go go go ...");
    }

    public void fuel() {
        System.out.println(" fuel is not enough");
    }
}

class carTest{
    public static void main(String[] args) {
        car mycar = new car("Swift");
        System.out.println("my car name is : " + mycar.name);
        mycar.Start();
        mycar.fuel();
        mycar.cardeatial();
    }
}
