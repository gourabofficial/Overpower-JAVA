package interfaces;

interface vehical {
    void start();
    void stop();
    void fuel();
}
class car implements vehical{
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
    public void fuel(){
        System.out.println("Car fueled");
    }
}
class bike implements vehical{
   public  void start(){
        System.out.println("Bike started");
    }
   public  void stop(){
        System.out.println("Bike stopped");
    }
    public void fuel(){
        System.out.println("Bike fueled");
    }
}
