package in.polymosphism;

public class Animal {
    void makesound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends Animal{
    void makesound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void makesound(){
        System.out.println("Cat meows");
    }
}
class horse extends Animal{
    void makesound(){
        System.out.println("Horse neighs");
    }
}
class main{
    public static void main(String[] args) {
        Animal a = new dog();
        a.makesound();
        a = new cat();
        a.makesound();
        a = new horse();
        a.makesound();
    }
}