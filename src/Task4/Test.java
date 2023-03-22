package Task4;

public class Test {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("KZT489454868564", "Damir", 50000);
        bank.getCurrentBalance();
        bank.getMoney(20000);
        bank.getCurrentBalance();
        bank.getMoney(100000);
        bank.getCurrentBalance();
    }
}
