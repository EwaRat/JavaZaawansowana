package bank.account;

public class NegativeWithdrawException extends Exception {

    public NegativeWithdrawException(String msg) {
        super(msg);
    }
}
