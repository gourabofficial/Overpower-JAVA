package SynchronizedTest;
public class main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        counter counter = new counter();

        updateThread t1 = new updateThread(counter);
        updateThread t2 = new updateThread(counter);

        t1.start();
        t2.start();

     try{
         t1.join();
         t2.join();
     }catch (InterruptedException e){
         System.out.println(e.getMessage());
     }

        long endTime = System.currentTimeMillis();
        System.out.println("Final counter: " +
                counter.getcounter() + " \nTime taken: " +(endTime - startTime));
    }
}
