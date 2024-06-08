public class Student_test {
    String name;
    int age;
    float marks;

    public static void main(String[] args) {
        Student_test gourab = new Student_test("gourab",26,9.99f);
        Student_test rahul = new Student_test("Rahul",21,8.00f);
        Student_test budda = new Student_test("budda",18,16.77f);


        System.out.println("Name is : " +rahul.name);
        System.out.println( "Age is : "+rahul.age);
        System.out.println("Marks is : "+rahul.marks);

        System.out.println("\n");

        System.out.println("Name is : " +gourab.name);
        System.out.println( "Age is : "+gourab.age);
        System.out.println("Marks is : "+gourab.marks);

        System.out.println("\n");

        System.out.println("Name is : " +budda.name);
        System.out.println( "Age is : "+budda.age);
        System.out.println("Marks is : "+budda.marks);
    }

    Student_test(String name, int age, float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

