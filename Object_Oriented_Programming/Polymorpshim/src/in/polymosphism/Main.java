package in.polymosphism;

public class Main {
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.show(10);
        obj.show("4","5");
        obj.show(5,3);
        System.out.println(obj.show("messi"));
    }


}