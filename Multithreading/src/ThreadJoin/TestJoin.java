package ThreadJoin;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException{
        task task1 = new task("task 1 is started");
        task task2 = new task("task 2 is started");
        task task3 = new task("task 3 is started");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t1.join();
        System.out.println(t1.getPriority());

        t2.start();
        t2.join();
        t2.setPriority(10);
        System.out.println(t2.getPriority());

        t3.start();
        t3.join();
        System.out.println(t3.getPriority());

    }
}

class task implements Runnable{

    String message;
    public task(String message){
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(message + " "+ " $ ");
        }
    }

}