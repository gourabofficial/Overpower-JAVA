abstract class vehicle{

public abstract void start();
public abstract void stop();

public void fuel(){
    System.out.println("please refuled");
}
}


class bike extends vehicle{
    public void start(){
        System.out.println("Bike is started");
    }
    public void stop(){
        System.out.println("Bike is stopped");
    }
}

class car extends vehicle{
    public void start(){
        System.out.println("Car is started");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
}
 