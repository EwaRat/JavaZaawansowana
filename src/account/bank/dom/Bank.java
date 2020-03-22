package account.bank.dom;

public class Bank {
    public static void main(String[] args) {

        Client c1=new PersonalClient("Jan", "Kowalski");
        Client c2=new BussinessClient("Atotech");

        Account a1= new CheckingAccount("123", 500, c1);
        Account a2= new CreditAccount ("12345",1500,c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
