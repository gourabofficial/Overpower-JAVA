package question;

public class firstQuestion {
    public static String concatenate(String... a) {
        StringBuilder sb = new StringBuilder();
        for(String str : a){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(concatenate("gourab"));
        System.out.print(concatenate("kr"));
        System.out.print(concatenate("ganguly"));
    }
}
