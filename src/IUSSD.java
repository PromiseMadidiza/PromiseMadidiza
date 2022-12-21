public interface IUSSD {
    public void login();
    public void createUser();
    public void sendMoney();
    public void deposit();
    public void Withdraw();   
    public void menu();
    public double checkBalance();
    public void start(String ussdcode); //Abstract method that will start your app
}
