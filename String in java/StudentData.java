public class StudentData {
    int age;
    String name;
    long roll;
    String house;

    StudentData(int age, String name, long roll, String house) {
        this.age = age;
        this.name = name;
        this.roll = roll;
        this.house = house;
    }


    @Override
    public String toString() {

        return "Student name : " + name + "\nStudent age : " + age + "\nStudent roll : " + roll + "\nStudent house : " + house;
    }

    public static void main(String[] args) {
       StudentData stu = new StudentData(21,"Gourab Ganguly ",27800122016l, "no name");
        System.out.println(stu);
    }
}

