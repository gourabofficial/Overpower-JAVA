public class Teachers {
    String name;
    int age ;
    String leaving ;
    String Fevsub ;

     public Teachers(String name,int age,String leaving,String Fevsub){
        this.name = name;
        this.age  = age;
        this.leaving = leaving;
        this.Fevsub = Fevsub;
    }
    Teachers(String naam){

         this.name = naam;

    }
    void display2(){
        System.out.println(name);
    }
   public void display(){
        System.out.println(name);
       System.out.println(age);
       System.out.println(leaving);
       System.out.println(Fevsub);

    }

}

