package in.gourab.learn;

public abstract class vehicle {

    String name;

    public void cardeatial(){
        System.out.println("this is my first car");
    }

    public vehicle(String name) {
        this.name = name;
    }

    public abstract void Start();
    public abstract void fuel();

}
