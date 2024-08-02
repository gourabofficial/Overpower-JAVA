package SynchronizedTest.mysirg;

import java.util.Scanner;

public class MultiThreading {
    public static void main(String[] args) {
        Account acc = new Account(1000,"Rahul");

        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}

class Account{
    private String name;
    private int balence;
    public Account(int balence,String name){
        this.balence = balence;
        this.name = name;
    }
    public boolean isSufficientBalence(int w){
        if(balence >= w){
            return true;
        }else{
            return false;
        }
    }
    public void withdraw(int ammount){
        balence = balence-ammount;
        System.out.println("Withdraw account is : " + ammount);
        System.out.println("your current balence is: " + balence);
    }
}
class Customer implements Runnable{
    private Account acc;
   public Customer(Account acc){
        this.acc = acc;
    }
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your withdraw ammount: ");
        int ammount = sc.nextInt();

        if(acc.isSufficientBalence((ammount))){
            acc.withdraw(ammount);
        }else{
            System.out.println("Insufficient balence");
        }
    }
}
