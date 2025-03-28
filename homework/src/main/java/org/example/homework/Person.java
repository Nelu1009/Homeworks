package org.example.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {

    private final int age;
    private final String name;
    private final Map<String, Object> additionalInfo;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
        this.additionalInfo = new HashMap<>();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void addAdditionalInfo(String key, Object value) {
        additionalInfo.put(key, value);
    }

    public Object getAdditionalInfo(String key) {
        return additionalInfo.get(key);
    }

    @Override
    public String toString() {
        return "Person's name is " + name + " and is " + age + " years old";
    }
    //is momente mici dar pana m-am gandit ca sa fac pur si simplu 2 metode toString pentru prima metoda de afisare
    public String toStringWithAdditionalInfo() {
        return "Person's name is " + name + " and is " + age + " years old" + " , any additional info: " + additionalInfo;
    }
}