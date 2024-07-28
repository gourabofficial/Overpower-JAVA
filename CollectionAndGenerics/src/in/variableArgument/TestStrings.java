package in.variableArgument;

public class TestStrings {
    public static void main(String[] args) {
        System.out.println(mearge("gourab", "=","good boy"));
        System.out.println(mearge("gourab","=", "footballer"));
        System.out.println(mearge("gourab","=", "Programmer"));
        System.out.println(mearge("gourab", "=","good Driver"));

    }
    public static String mearge(String...a){
        String string  = " ";
        for (String s : a){
            string = string + s;
        }
        return string;
    }
}
