public class LearnStatic2 {
    //Static method
    public  static void Myclass(){
        System.out.println("i am in a Static Method");
    }
    public static void main(String[] args) {
        //without creating an object we can use it
        Myclass();
        //creating a object then we use it, beacuase that is a non static method
        NonStatic obj = new NonStatic();
        obj.YourClass();
    }
}

class NonStatic{
    //Non static method
    public void YourClass(){
        System.out.println("I am in non Static method ");
    }
}
