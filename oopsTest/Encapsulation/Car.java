 package Encapsulation;

public class Car {
    String name;
    String color;
    private int price;

    Car(){

    }

    public int getprice(){

        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
}

class main{
    public static void main(String[] args) {

        Car mycar = new Car();
        mycar.color = "red";
        //mycar.getprice();
        mycar.setprice(7497597);
        mycar.name = "toto";
        System.out.println(mycar.color + " " + mycar.name + " " +mycar.getprice());
    }
}