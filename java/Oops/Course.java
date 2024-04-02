import javax.swing.text.Style;

public class Course {
    String courseName;
    int EnrolledStudent = 0;
    static int maxCapacity = 100;
    String [] entrollStudent;

    Course(String courseName){
        this.courseName = courseName;
        this.entrollStudent = new String[maxCapacity];
    }


    void getEnrolledStudent(String Studentname){
        entrollStudent[EnrolledStudent] = Studentname;
        EnrolledStudent++;
        System.out.println(Studentname);

    }
    void unenrollmentStudent(String Studentname){
        System.out.println("Student Removed");
        EnrolledStudent--;
    }

    public static void main(String[] args) {
        Course javacourse = new Course("java");
        javacourse.getEnrolledStudent("gourab");
        javacourse.getEnrolledStudent("gourab1");
        javacourse.unenrollmentStudent("gourab");

    }
}
