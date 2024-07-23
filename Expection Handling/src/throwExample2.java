public class throwExample2 {
    public static void main(String[] args) {

        checkage(18);
        System.out.println("Access granted - You are old enough!");
    }
    public static void checkage(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }

    }
}
