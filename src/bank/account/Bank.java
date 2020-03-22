package bank.account;



public class Bank {

    public static void main(String[] args) {

        Client c1 = new PersonalClient("Jan", "Kowalski");
        Client c2 = new BussinessClient("Acma");
        if (c2 instanceof BussinessClient) {
       //     System.out.println("biznesowy" + ((BussinessClient) c2).getNip());  //rzutowanie bo metoda getNip bylo w klasie BussinessClient!!
        }

//        CreditAccount a1=new CreditAccount ("1234", 500,c1);
       Account a1=new CheckingAccount("2341", 100, c1);
//        CreditAccount a3=new CreditAccount ("3412", 200, c2);
//
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(c1);

        //wyjatek jesli bedzie chcialo sie wyplacic mniej niz 0 zl

        try {
            a1.withdraw(-5);
        }catch (NegativeWithdrawException e) { // jaki ma zlapac wyjatek
            System.out.println("Sytuacja wyjątkowa! " + e.getMessage()); //wypisuje wiadomosc z klasy account gdzie zadeklarowany exception
        } finally {
            System.out.println("Blok finally"); //wykona sie zawsze ten blad nie wazne czy mamy sytuacje wyjatkowa (<0) czy nie

        }
        System.out.println("Hello");

        try {
            a1.deposit(-5);

        } catch (NegativeWithdrawException e) {
            System.out.println("Druga wyjatkowa sytuacja! " + e.getMessage());

        } finally {
            System.out.println("Koniec");
        }

    }
}
