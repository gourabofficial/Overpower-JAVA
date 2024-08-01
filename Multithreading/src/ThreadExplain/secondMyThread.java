package ThreadExplain;
//using runable interface ,lets see
public class secondMyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running ");
    }

    public static void main(String[] args) {
        secondMyThread obj = new secondMyThread();
        Thread t1 = new Thread(obj); // we have to pass obj as parameter
        t1.start();
    }
}
