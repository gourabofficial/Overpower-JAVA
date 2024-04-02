public class StudentData {
    int age;
    String name;

    public StudentData(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Student Detail : {name :" + name + " age:" + age + " }";
    }




    public static void main(String[] args) {
       StudentData stu = new StudentData(20,"Gourab");
        System.out.println(stu);
    }
}

