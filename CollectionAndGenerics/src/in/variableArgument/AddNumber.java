package in.variableArgument;

public class AddNumber {
    public static void main(String[] args) {
        System.out.println("Sum is: " +sum(5,5,5,5,5,5,5,5,100));
    }

    public static int sum(int first , int second, int ... a){
        int sum = first + second;
        for (int i : a){
            sum = sum + i;
        }
        return sum;
    }
}
