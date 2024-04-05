public class StudentData {
    int age;
    String name;
    long roll;
    String house;

    public StudentData(int age, String name, long roll, String house) {
        this.age = age;
        this.name = name;
        this.roll = roll;
        this.house = house;
    }


    @Override
    public String toString() {

        return STR."Student Detail : {name :\{name} age:\{age} roll: \{roll} house: \{house} }";
    }

    public static void main(String[] args) {
       StudentData stu = new StudentData(21,"Gourab Ganguly ",27800122016l, "no name");
        System.out.println(stu);
    }
}

