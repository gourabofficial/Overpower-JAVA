public class LearnStatic {

     static class example{
       static String name = "rana";

       example(String name ){
           example.name = name;
       }
     }
    public static void main(String[] args) {

        example obj = new example("Rahul");
        System.out.println(example.name);
        System.out.println(obj.name);
        System.out.println(example.name);
    }
}
