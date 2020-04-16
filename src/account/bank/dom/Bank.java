package account.bank.dom;

import bank.account.NegativeWithdrawException;

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

        try
        {
            a1.withdraw(600);
        } catch (NegativeWithdrawException e) {
            System.out.println("Bład" + e.getMessage());
        }
        finally {
            System.out.println("Koniec");
        }

        try {
            a1.deposit(-5);
        } catch (NegativeWithdrawException e) {
            System.out.println("Bład krytyczny " + e.getMessage());
        }
        finally {
            System.out.println("Koniec 2");
        }



}
}
