
class Student{
    String name;
    int age;

    public void GetInfo(){
       System.out.println("the GOAT is  : "+ this.name);
       System.out.println("GOAT age : "+ this.age);
    }
}


public class Oops{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ishowspeed";
        s1.age = 24;
        s1. GetInfo();
        System.out.println(" ");


        Student s2 = new Student ();
        s2.name = "Roanldo";
        s2.age = 39;
        s2.GetInfo();
        System.out.println(" ");

        Student s3 = new Student ();
        s3.name = "Gourab Ganguly";
        s3.age = 20;
        s3. GetInfo();
    }
}