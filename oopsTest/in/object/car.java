package in.object;

public class car {
    String name;
    int carNum;
    int NoOfShets;
    float fuelLevel;
    int MaxSpeed;

    car(){
        name = "Lamborgini";
        MaxSpeed = 150;
    }


    public float GetFuel (float fuel){
        fuelLevel += fuel;
        System.out.println("After getting Fuel : " +fuelLevel);
         return fuelLevel;

   }

    public void Drive(){
        System.out.println("Car is starting....Lets goo");
        fuelLevel--;
        System.out.println("now your Fuel level is: " +fuelLevel);
    }
    public void currentfuel(){
        if(fuelLevel < 5){
            System.out.println("Fuel is low ,please Refuel");
        }else{
            System.out.println("Good..Fuel is efficient");
        }
    }
}
