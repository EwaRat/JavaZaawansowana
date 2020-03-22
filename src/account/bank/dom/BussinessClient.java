package account.bank.dom;

public class BussinessClient extends Client {

    private String name;

    public BussinessClient(String name) {
        this.name=name;

    }

    @Override
    public String toString() {
        return "BussinessClient{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getNip () {
        return "1234";
    }

}
