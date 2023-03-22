package Task4;

public class BankAccount {
    private String account;
    private String name;
    private int balance;

    public BankAccount(){

    }
    public BankAccount(String account, String name, int balance){
        this.account = account;
        this.balance = balance;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getMoney(int money){
        if (money > getBalance()){
            System.out.println("You don't have enough money!");
        }
        else{
            setBalance(getBalance() - money);
            System.out.println("Take yours " + money + "$");
            System.out.println("You've got " + getBalance() + "$ on your account");
        }
    }
    public void getCurrentBalance(){
        System.out.println("Your current balance = " + getBalance() + "$");
    }
}