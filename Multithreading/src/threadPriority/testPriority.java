package threadPriority;

public class testPriority {
    public static void main(String[] args) {
        Printtask task1 = new Printtask("task 1: a");
        Printtask task2 = new Printtask("task 2: b");
        Printtask task3 = new Printtask("task 3: c");

        Thread t1 = new Thread(task1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread t2 = new Thread(task2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        Thread t3 = new Thread(task3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        System.out.println("Thread 1 priority: " + t1.getName());
        System.out.println("Thread 2 priority: " + t2.getName());
        System.out.println("Thread 3 priority: " + t3.getName());
    }
}
