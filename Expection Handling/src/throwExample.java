public class throwExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int result;

        try {
            if (b == 0) {
                throw new ArithmeticException("can't devide by zero");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            result = a/b;
            System.out.println(result);
        }catch(ArithmeticException exception){
            System.out.println("enter the right value");
        }
    }
}
