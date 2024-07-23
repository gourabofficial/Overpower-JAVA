class exemple{
    
    public static void main(String[] args) {
        test obj = new test();
        obj.setAge(19);
        obj.setName("NBA");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

 class test{
   private String name;
    private int age;

    public String getName(){

        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getAge(){

        return age;
    }
    public void setAge(int a){

        age = a;
    }
 }
