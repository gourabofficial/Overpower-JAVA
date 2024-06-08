package SuperKeyword;

public class animal {
    String color = "(parent class),white";

}
class dog extends animal{
    String color = "Black";
     public void display(){
         System.out.println(color);
         System.out.println(super.color);//when we use (super.color),derect access parent class
    }
}
class superMain{
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.display();
    }
}