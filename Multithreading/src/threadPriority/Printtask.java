package threadPriority;

public class Printtask implements Runnable{



    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println(ch + " " + i);
        }
    }


    private final String ch;
    public Printtask(String c) {
        this.ch = c;
    }
}
