/*write a program thats creates two threads ,Each threads  should print "Hello from threads x" where x is the thread number
 x is the number of thread (1 or 2) ,ten time and then terminates.
 */

public class helloThread extends Thread {

    private final int threadNumber;

    helloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello thread from : " + threadNumber);
        }
    }

   

        public static void main(String[] args) {
            helloThread thread1 = new helloThread(1);
            helloThread thread2 = new helloThread(2);

            thread1.start();
            thread2.start();
        }
    }

