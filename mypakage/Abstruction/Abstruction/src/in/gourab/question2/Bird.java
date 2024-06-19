package in.gourab.question2;

 public class Bird implements Flyable{
  private final String name;
  Bird(String name){
    this.name = name;
}

     public String getName() {
         return name;
     }

     @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
