package account.bank.dom;

public class PersonalClient extends Client {

    private String firstName;
    private String secondName;

    public PersonalClient(String firstName, String secondName) {
        this.firstName=firstName;
        this.secondName=secondName;

    }

    @Override
    public String toString() {
        return "PersonalClient{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
