public class Transaction {
    double balance;

    public Transaction(double balance){
        if (balance > 0.0)
        this.balance = balance;
    }
    public void deposit(double amountDeposit){
        if(amountDeposit > 0.0)
        balance = balance + amountDeposit;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amountWithdraw){
    
    }
}
