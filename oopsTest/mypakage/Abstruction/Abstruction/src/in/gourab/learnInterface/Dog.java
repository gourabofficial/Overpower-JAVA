package in.gourab.learnInterface;

public class Dog implements play, animal {
    public void maksound(){
        System.out.println("Dog sound...");
    }
    public void eat(){
        System.out.println("Dog eat somthing");
    }
    public void play(){
        System.out.println("Dog play football");
    }
}

class testInterface{
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.animal();
        mydog.maksound();
        mydog.eat();
        mydog.play();
    }
}