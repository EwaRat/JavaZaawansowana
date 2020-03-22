package bank.account;

public class CreditAccount extends Account {
    public CreditAccount(String number, int balance, Client client) {
        super(number, balance, client);
    }


        @Override //nadpisanie - adnotacja, wskazówka
        public int withdraw(int cash) {  // jest to po to, ze tu moze byc mniej niz 0 na koncie kredytowym, a w kl account bylo ze nie moze byc <0;
            super.balance -=cash;
            return cash;
        }
    }

