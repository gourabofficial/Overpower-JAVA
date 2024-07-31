public class TryThread {
    public static  void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        a obj1 = new a();
        b obj2 = new b();
        c obj3 = new c();
        d obj4 = new d();

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
    }

}

class a extends Thread{
    public void run(){
        for (int i = 1; i < 50; i++) {
            System.out.print(" hey ");
        }
        System.out.println(Thread.currentThread().getName());
    }

}
class b extends Thread {
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.print(" hello ");
        }
    }
}
class c extends Thread {
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.print(" hii ");
        }
    }
}
class d extends Thread {
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.print(" Namasta ");
        }
    }
}