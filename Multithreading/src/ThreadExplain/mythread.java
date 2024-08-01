package ThreadExplain;
//first we extend Thread class okey, lets see
public class mythread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        mythread obj = new mythread();
        obj.start(); // start() it is method
    }
}
