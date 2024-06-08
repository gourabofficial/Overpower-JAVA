package setter;

public class testsetter {

    private  String name;
    private int age;

    testsetter(){

    }

    //we can also use ToString method or a simple method

//    @Override
//    public String toString() {
//        return "Name : " +name+ "\nage is : " +age;
//    }

    //setter method
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age = age;
    }
//we can also use toString method or a simple method
    public void displayInfo(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
    }
}
class main{
    public static void main(String[] args) {
        testsetter obj = new testsetter();
        obj.setName("Gourab Ganguly");
        obj.setAge(20);
        obj.displayInfo();

    }
}
