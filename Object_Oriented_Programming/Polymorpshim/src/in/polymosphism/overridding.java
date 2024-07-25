package in.polymosphism;

public class overridding {
    public static void main(String[] args) {
       // overloading obj = new overloading();
        a a1 = new a();
        System.out.println(a1.add(4,5));

        b b1 = new b();
        System.out.println(b1.add(4,5)); // 10

        a c1 = new c();
        System.out.println(c1.add(4,5)); // 11
     }
    }

class a{
    public int add(int a,int b){
        return a+b;
    }
}
class b extends a{
    public int add(int a,int b){
        return a+b+1;
    }
}
class c extends a {
    public int add(int a, int b) {
        return a + b + 2;
    }
}