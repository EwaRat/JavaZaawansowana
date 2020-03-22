package account.bank.dom;

public class Account {

    private String number;
    private int balance;
    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit (int cash) {
        balance += cash;
    }

    public int withdraw ( int cash) {
        balance -= cash;

        return cash;
    }


    public int getBalance () {
        return balance;
    }

    public boolean transfer(Account target,int amount) {
        balance -=amount;
        target.balance +=amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
