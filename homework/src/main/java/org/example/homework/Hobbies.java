package org.example.homework;

public class Hobbies {
    private final String hobby;
    private final int frequency;
    private final String listOfAdresses;

    public Hobbies(String hobby, int frequency, String listOfAdresses) {
        this.hobby = hobby;
        this.frequency = frequency;
        this.listOfAdresses = listOfAdresses;
    }

    public String getHobby() {
        return hobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getListOfAdresses() {
        return listOfAdresses;
    }

    @Override
    public String toString() {
        return " " + hobby + ", frequency: " + frequency + ", List of adresses: " + listOfAdresses;
        //ma tot gandeam ce sa fac ca in output dupa hobby = sa fie spatiu inainte de denumirea hobbyului pana mi-am dat seama sa pun niste
        //niste ghilimele goale
    }
}