package bank.account;

public class Account {

    private String number;

    protected int balance;  //zmiana na protected
    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number; // this-odwolanie sie do pola naszej klasy, bo number w private to inny nr niz w public account
        this.balance = balance;
        this.client = client;
    }

    public void deposit(int cash) throws NegativeWithdrawException {//ta metoda nic nie zwraca
        if (cash >0) {     // czyli nie mozemy wplacic mniej niz 0zl
            balance += cash;
        }
        else {
            throw new NegativeWithdrawException("Proba wplaty mniej niz 0 zł");
            //System.out.println("podana kwota musi byc wieksza niz 0zl");
        }
    }

    public int withdraw(int cash) throws NegativeWithdrawException {// w nawiasie parametr wejsciowy funkcji
        if (cash <= balance) {   //czyli nie mozemy wyplacic wiecej niz mamy
            balance -= cash;

        }
        if (cash < 0) {
            throw new NegativeWithdrawException("Próba wypłaty mniej niz 0"); //dopisanie wyjatku - dziedziczy po RunTime, dlatego nie trzeba throws
            //System.out.println("Nie mozesz wyplacic kwoty wiekszej niz masz na koncie");
            //return 0;
        }
        return cash;
    }



    public int getBalance() {  // getBalance - odwoluje sie bezposrednio do pola
        return balance;
    }

    public boolean transfer(Account target, int amount) {  // czy udal sie transfer- tak/nie
        balance -= amount;
        target.balance += amount;
        return true;
    }

    @Override
    public String toString() {
        String x =super.toString(); // to bylo dla sprawdzenia dzialania super
        return "Stan konta " + number + "; " + balance;

    }


}


