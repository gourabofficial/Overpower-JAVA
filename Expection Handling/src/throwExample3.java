public class throwExample3 {
    public static void printname(String name){
        if(name == null){
            throw new ArithmeticException("Name can't be null");
        }
        if(name == "ishowspeed"){
            throw new ArithmeticException("Name can't be ishowspeed");
        }
        System.out.println("Name is : " +name);

    }

    public static void main(String[] args) {
        //printname(null);
       // printname("ishowspeed");
        printname("ishowspeed");
    }
}
