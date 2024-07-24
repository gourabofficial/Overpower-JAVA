

abstract  class Animal{
    public void makesound(){
        System.out.println("Animal sound...");

    }
    public void eatSomthing(){
        System.out.println("Animal Eating...");
    }
    public static void main(String[] args) {

       dog mydog = new dog();
       mydog.dogsound();
       mydog.makesound();
       mydog.eatSomthing();

       cat mycat = new cat();
       mycat.catsound();
       mycat.makesound();
       mycat.eatSomthing();
       

    }

}
class dog extends Animal{
    public void dogsound(){
        System.out.println("dog sound..");
    }
}
class cat extends Animal{
    public void catsound(){
        System.out.println("cat sound..");
    }
 }

