package Inheritance.challenge;

public class DVD extends Library{
     private String timeDuration;

}
class testmain{
    public static void main(String[] args) {
        book b1 = new book();
        b1.checkout();
        b1.returnStatus();

        magazine obj = new magazine();
        obj.checkout();
        obj.returnStatus();

        DVD dvd = new DVD();
        dvd.checkout();
        dvd.returnStatus();
    }
}
