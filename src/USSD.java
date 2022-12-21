import java.util.Scanner;





public class USSD implements IUSSD {
    Scanner input;
    private int amount;

    USSD() {
        input = new Scanner(System.in);
    }

    @Override
    public void login() {
        System.out.print("Username: ");
        String Username = input.next();
        System.out.print("PinNumber: ");
        int PinNumber = input.nextInt();

        // Validation

    }

    @Override
    public void createUser() {

    }

    @Override
    public void menu() {

    }

    @Override
    public void sendMoney() {

    }

    @Override
    public void deposit() {
        amount += 500;
        System.out.print("Deposit amount:" + amount);

    }

    @Override
    public void Withdraw() {

        
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void start(String ussdcode) {
        if (ussdcode.compareTo("*120*359#") == 0) {

        }

    }

}
