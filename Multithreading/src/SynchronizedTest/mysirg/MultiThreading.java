package SynchronizedTest.mysirg;

import java.util.Scanner;

public class MultiThreading {

    public static void main(String[] args) {
        Account acc = new Account(1000);

        Customer c1 = new Customer(acc, "rahul");
        Customer c2 = new Customer(acc, "kiran");
        Customer c3 = new Customer(acc, "sujoy");
        // Customer c4 = new Customer(acc,"saheb");
        // Customer c5 = new Customer(acc,"raja");
        // Customer c6 = new Customer(acc,"papu");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        // Thread t4 = new Thread(c4);
        // Thread t5 = new Thread(c5);
        // Thread t6 = new Thread(c6);

        t1.start();
        t2.start();
        t3.start();
        // t4.start();
        // t5.start();
        // t6.start();

    }
}

class Account {

    private int balence;

    public Account(int balence) {
        this.balence = balence;

    }

    public boolean isSufficientBalence(int w) {
        if (balence >= w) {
            return true;
        } else {
            return false;
        }
    }

    public void withdraw(int ammount) {
        balence = balence - ammount;
        System.out.println("Withdraw account is : " + ammount);
        System.out.println("your current balence is: " + balence);
    }
}

class Customer implements Runnable {

    private String name;
    private Account acc;

    public Customer(Account acc, String name) {
        this.acc = acc;
        this.name = name;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        synchronized (acc) {
            System.out.println(name + " Enter your withdraw amount: ");
            int ammount = sc.nextInt();

            if (acc.isSufficientBalence((ammount))) {
                System.out.println(name);
                acc.withdraw(ammount);
            } else {
                System.out.println("Insufficient balence");
            }
        }
    }
}
