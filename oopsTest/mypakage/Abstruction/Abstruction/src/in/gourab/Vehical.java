package in.gourab;

public abstract class Vehical {
    private String name;
    private int noOfDoors;

    Vehical(String name,int doors){
        this.name = name;
        this.noOfDoors = doors;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }
   public  void display(){
        System.out.println(name);
    }
}
