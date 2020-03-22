package bank.account;

public class PersonalClient extends Client {
    private String fistName;
    private String secondName;

    public PersonalClient (String fistName, String secondName) {
        this.fistName = fistName;
        this.secondName = secondName;
    }
}
