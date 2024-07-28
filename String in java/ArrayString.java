public class ArrayString {
    public static void main(String[] args) {
        String arr[] = { "Cristiano", "Ronaldo", "is",  "the", "best",
                "player", "in", "the", "world."};
        StringBuilder sb = new StringBuilder();
     for (String str : arr){
         sb.append(str).append(" ");
      }
        System.out.println(sb);
    }
}
