package in.gourab.animal;

abstract class Animal {
    //abstract method
    public abstract void makesound();
    public abstract void sleep();

    //normal method
    public void eat(){
        System.out.println("Eating..");
    }

}
//creating a child class

class dog  extends Animal{
   public void makesound (){
       System.out.println("sound...");
   }
   public void sleep(){
       System.out.println("sleeping...");
   }

}
class testAnimal{
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.makesound();
        mydog.eat();
        mydog.sleep();

    }
}