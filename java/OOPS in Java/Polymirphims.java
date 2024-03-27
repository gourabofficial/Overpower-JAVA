class Student{
    String name;
    int age;

    public void GetInfo(String name){
        System.out.println(name);
    }
    public void GetInfo(int age){
        System.out.println(age);
    }
    public void GetInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}



public class Polymirphims {
    public static void main(String args[]){
       Student s1 =  new Student ();
       s1.name = "Ishowspeed";
       s1.age = 24;
       s1.GetInfo(s1.name,s1.age);
    }
    
}
