package zad4;

public enum Pets {
    DOG("hau"),CAT("miau"), RABBIT("?");

    private String sound;

    Pets(String sound) {
        this.sound = sound;
    }

    public void giveSound() {
        System.out.println(sound);
    }
}



