




public class secondQuestion {
    public static void main(String[] args) throws InterruptedException {
        a thread1 = new a();
        b thread2 = new b();
        c thread3 = new c();

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }

}

class a extends Thread {

    @Override
    public void run() {
        System.out.println("thread a running");
        for(int i = 1; i <= 10; i++){
            System.out.printf("(%d) Hello from thread a\n", i);
        }

        try {
            Thread.sleep(000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}

class b extends Thread {

    @Override
    public void run() {
        System.out.println("thread b running");

        for(int i = 1; i <= 10; i++){
            System.out.printf("(%d) Hii from thread b\n", i);
        }


        try {
            Thread.sleep(000);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class c extends  Thread{

    @Override
    public void run() {
        System.out.println("thread c running");

        for(int i = 1; i <= 10; i++){
            System.out.printf("(%d) good morning from thread c\n", i);
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}