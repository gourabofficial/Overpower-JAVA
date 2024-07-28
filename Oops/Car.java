public class Car {
    int noOfwheels;
    String color;
    float Speed;
    float runKm;
    float currentFuel;

    Car() {
        this.noOfwheels = 4;
        this.color = "red";
        this.Speed = 150;
        this.runKm = 55;
        this.currentFuel = 6;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfwheels=" + noOfwheels +
                ", color='" + color + '\'' +
                ", Speed=" + Speed +
                ", runKm=" + runKm +
                ", currentFuel=" + currentFuel +
                '}';
    }
}


//    public void drive(){
//        currentFuel--;
//        if(currentFuel < 2){
//            System.out.println("fuel is low ! ");
//
//        } {
//            System.out.println("Car is Driving");
//        }
//
//
//    }
//    public void addFuel(float fuel){
//        currentFuel += fuel;
//    }
//
//    public void Start(){
//        if(currentFuel == 0 ){
//            System.out.println("Car not started ");
//        }else if(currentFuel < 5){
//            System.out.println("fuel is minimum , please add some Fuel");
//        }else{
//            System.out.println("fuel is enough , Car Driving...");
//        }
//    }
//
//    public void Color(){
//        System.out.println("the car color is Black ");
//    }
//    public void CurrentFuel() {
//        System.out.println(currentFuel);
//    }
//}
