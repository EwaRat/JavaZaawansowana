package account.bank.dom;

public class CreditAccount extends Account {
    public CreditAccount(String number, int balance, Client client) {
        super(number, balance, client);
    }

    @Override
    public int withdraw(int cash) {
        return super.withdraw(cash);
    }
}
