package interfaces;

public class main {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.start();
        mycar.fuel();
        mycar.stop();

        bike mybike = new bike();
        mybike.start();
        mybike.fuel();
        mybike.stop();
    }
}
