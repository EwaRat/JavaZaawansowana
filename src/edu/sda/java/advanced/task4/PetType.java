package edu.sda.java.advanced.task4;

public enum PetType {
    DOG("wuf wuf"), CAT("miau"), FISH ("?"), RABBIT("wiii"), COW("muu");

    private String sound;

     PetType (String sound) { // konstruktor
         this.sound=sound;
     }

     public void giveSound() {
         System.out.println(sound);
     }

     public static PetType find (String input) { //odp na pyt jakie zwierze daaje dany glos
         for(PetType petType: values())  //dla kazdego pettype w naszych wartosciach
             if(petType.sound.equals(input)) { //dla kazdego typu zobacz jaki jest glos i porownaj do wejsciowego i zwroc pettypa, jezeli to zaden
                                                // to zwroc nulla
                 return petType;
             }
         return null;
     }
}
