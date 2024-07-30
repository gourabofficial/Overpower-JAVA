public class TryThread {
    public static  void main(String[] args) {
        a obj1 = new a();
        b obj2 = new b();

        obj1.start();
        obj2.start();
    }
}

class a extends Thread{
    public void run(){
        for (int i = 1; i < 1000; i++) {
            System.out.println("hey");
        }
    }
}
class b extends Thread {
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println("hello");
        }
    }
}