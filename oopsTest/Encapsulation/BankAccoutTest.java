package Encapsulation;

public class BankAccoutTest {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(1225,"Gourab");
        myAcc.depositMoney(500);
        myAcc.depositMoney(200);
        myAcc.withdrawMoney(100);

    }
}
