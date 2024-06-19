// static keyword use in detail int this program
//GOURAB GANGULY; 19th May 2024;

public class Static {
    public static void main(String[] args) {
        //when we use a static method from another class we create a object of that class
        // then we can use that method
        testAll t1 = new testAll();
        t1.test1();
        t1.test2();
        //when we use a static variable from another class we can use it directly
        System.out.println(staticvariable.a);
        System.out.println(staticvariable.b);

        //when we use a static variable from another class we create a object of that class
        // then we can use that variable
        // we can also use the method of that class

        staticvariable obj = new staticvariable();
         obj.display();

    }
}


class testAll{
    void test1(){
        System.out.println("Successfull testing 1");
    }
    void test2(){
        System.out.println("Successfull testing 2");
    }
}

class staticvariable{
    static int a = 7;
    static int b = 10;
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println("Sum of two number is :" + (a+b));
    }
}