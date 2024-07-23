

class getter{

    private String name;
    private int salary;
    private int accNo;
    private int pincode;
    
    //getter function for access private property
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }

    public int getAccNo(){
        return accNo;
    }
    public void setAccNo(int a){
        this.accNo = a;
    }
    public int getPincode(){
        return pincode;

    }
    public void setPincode(int p){
        this.pincode = p;
    }


    public static void main(String[] args) {
        getter obj = new getter();

        obj.setName("Milon");
        obj.setSalary(1000);
        obj.setAccNo(166906736);
        obj.setPincode(2222);

        System.out.println("My Name: " + obj.getName());
        System.out.println("My Salary: " + obj.getSalary());
        System.out.println("My Acc No: "+ obj.getAccNo());
        System.out.println("My Pin: "+ obj.getPincode());

    }
}