package account.bank.dom;

import bank.account.NegativeWithdrawException;

public class Account {

    private String number;
    private int balance;
    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit (int cash) throws NegativeWithdrawException {
        if (cash>0) {
            balance += cash;

        }else {
            throw new NegativeWithdrawException("NIe mozna wykonac operacji");
        }
    }

    public int withdraw ( int cash) throws NegativeWithdrawException {

        if (cash>0) {
            balance -= cash;

            return cash;

        } else{
            throw new NegativeWithdrawException("NIe można wypłacić mniej niz 0!!");
        }
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
