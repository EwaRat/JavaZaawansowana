package edu.sda.java.advanced.task4;

public class EnumExample {
    public static void main(String[] args) {

        PetType type1= PetType.DOG;
        PetType type2= PetType.CAT;
        PetType type3= PetType.FISH;
        PetType type4= PetType.RABBIT;

      System.out.println(type1==type2);
       System.out.println(type1==type3);

        type1.giveSound();
        type2.giveSound();
        type3.giveSound();

        PetType[] petTypes=PetType.values();
        for (PetType s : petTypes) {
            s.giveSound();
        }
        //PetType pet= PetType.valueOf("OOW");
        //pet.giveSound();

        PetType petThatGivesMuu=PetType.find("muu");
        System.out.println(petThatGivesMuu);
    }
}