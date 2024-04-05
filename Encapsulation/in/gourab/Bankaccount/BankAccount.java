package in.gourab.Bankaccount;

public class BankAccount {
    private String name;
    private String AccNum;
    private double blance;

    public BankAccount(String name, String accNum,double blance) {
        this.name = name;
       this.AccNum  = accNum;
       this.blance = blance;
    }

    public void DepositMoney(double money){
        if(money > 0){
            blance += money;
        }else{
            System.out.println("Invalid Deposit");
        }
        System.out.println("Available Blance: "+blance);
    }
    public void Withdraw(double money){
        if(blance >= money){
            blance -= money;
            System.out.println("Withdraw succesfully");
            System.out.println("Available blance : "+blance);
        }else{
            System.out.println("Invalid Withdraw");
        }
    }
}
