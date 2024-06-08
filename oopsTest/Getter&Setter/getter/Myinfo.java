package getter;

public class Myinfo {

   private String name;
    private  int age;
    private String contactNum;

    Myinfo(String name,int age, String contactNumber){
        this.name = name;
        this.age = age;
        this.contactNum = contactNumber;
    }


    //Access using Getter Method

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getContactNum(){
        return contactNum;
    }

   }


class Gettertest {
    public static void main(String[] args) {
        Myinfo obj = new Myinfo("gourab",20,"835234846");
        System.out.println(obj.getName() + "," + obj.getAge() + "," + obj.getContactNum());
    }
}
