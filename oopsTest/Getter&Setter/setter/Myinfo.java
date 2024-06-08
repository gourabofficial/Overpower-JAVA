package setter;

public class Myinfo {
    private String name;
    private int age;
    private String contactNum;

    Myinfo(){
        this.name = name;
        this.age =age;
        this.contactNum = contactNum;

        }
        //Using Setter Method
        public void setName(String n){
        this.name = n;
        }
        public void setAge(int a){
        this.age = a;
        }
        public void setContactNum(String contactnumber){
        this.contactNum = contactnumber;
        }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getContactNum() {
        return contactNum;
    }
}

//test the sitter method 

class SetterTest{
    public static void main(String[] args) {
        Myinfo obj = new Myinfo();
        //using setter method to set the value
        obj.setName("Gourab Ganguly");
        obj.setAge(20);
        obj.setContactNum("629756393");

        System.out.println("NAME: " + obj.getName()+ " AGE: " + obj.getAge()+ " CONTACT: " + obj.getContactNum());

    }
}
