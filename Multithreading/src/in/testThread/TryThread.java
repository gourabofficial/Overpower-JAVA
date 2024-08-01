package in.testThread;

public class TryThread {
    public static void main(String[] args) {
        ExampleRunable obj1 = new ExampleRunable('*');
        ExampleRunable obj2 = new ExampleRunable('#');
        ExampleRunable obj3 = new ExampleRunable('$');

        Thread t1 = new Thread(obj1);
        t1.start();
        Thread t2 = new Thread(obj2);
        t2.start();
        Thread t3 = new Thread(obj3);
        t3.start();
    }

}