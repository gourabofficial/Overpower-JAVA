package in.gourab.Employ;

public class TestEmployee {
    public static void main(String[] args) {
        Employed employee = new Employed("Gourab Ganguly", 20 ,5000.0);
        System.out.println(employee.EmployeeDetails());
        employee.setAge(21);
        System.out.println(employee.getAge());
       
    }
}
