public class Age {
    static void validateAge(int age){
       try{
           if(age < 18){
               throw new ArithmeticException("You are not eligible to vote");
           }else{
               System.out.println("You are eligible to vote");
           }
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }

    public static void main(String[] args) {
        validateAge(16);
    }
}
