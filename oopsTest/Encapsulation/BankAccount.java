package Encapsulation;

public class BankAccount {
    private int AccNo;
    private String AccoHolderName;
    private int balance;

    public BankAccount(int accNo, String accoHolderName) {
        this.AccNo = accNo;
        this.AccoHolderName = accoHolderName;
    }

    public void depositMoney(int money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            System.out.println("Deposit " + money + " success");
            balance += money;
            System.out.println("After deposite : " + balance );
        }

    }
    public void withdrawMoney(int money){
        if(balance >= money){
            System.out.println("Withdraw Money Succes");
            balance -= money;
        }else{
            System.out.println("balance not sufficent");
        }
        System.out.println("After withdraw Available money: " + balance);
    }
}
