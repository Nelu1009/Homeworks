package org.example.homework;

public class LiviesIn {
    private final String adress;
    private final String country;

    public LiviesIn(String adress, String country) {
        this.adress = adress;
        this.country = country;
    }

    public String getAdress() {
        return adress;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return " Adress: " + adress + ", Country: " + country;
    }

}
