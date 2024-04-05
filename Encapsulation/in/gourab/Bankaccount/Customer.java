package in.gourab.Bankaccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount Account = new BankAccount("Gourab Ganguly","16683",1000);
        //Account.DepositMoney();
        Account.Withdraw(100);
       // Account.DepositMoney(0);
    }
}
