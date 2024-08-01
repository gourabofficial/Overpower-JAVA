package in.testThread;

public class ExampleRunable implements Runnable {
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.print(c + " ");
        }

       // System.out.println(TryThread.currentThread().getName());
    }
    private final char c;
    public ExampleRunable(char c){
        this.c = c;
    }
}
