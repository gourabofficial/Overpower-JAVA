package SuperKeyword;

public class Goat{
    Goat(String name ){
        System.out.println("this is our super class name : " + name);
    }
}
class ronaldo extends Goat{
    ronaldo(String name){
        super(name);
        System.out.println("this is our subclass name: " + name);
    }
}

class supertest{
    public static void main(String[] args) {
        ronaldo ronaldo = new ronaldo("Ronaldo");
    }
}