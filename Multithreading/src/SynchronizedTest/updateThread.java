package SynchronizedTest;

public class updateThread extends Thread {
    public final counter count;

    public updateThread(counter count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            count.increment();
        }
    }
}
