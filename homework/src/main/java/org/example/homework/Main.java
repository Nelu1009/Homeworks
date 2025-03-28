package org.example.homework;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Person> people = new TreeSet<>(new ComparatorVarsta());

        Person p1 = new Person(30, "Ion");
        Person p2 = new Person(20, "Gheorghe");
        people.add(p1);
        people.add(p2);

        for(Person person : people){
            System.out.println(person);
        }

        p1.addAdditionalInfo("hooby ", new Hobbies("Fishing", 2, "Lacul Valea Morilor"));
        p1.addAdditionalInfo("employment ", new EmploymentStatus(true));
        p1.addAdditionalInfo("student ", new Student(false));
        p1.addAdditionalInfo("livesIn ", new LiviesIn("Strada Constitutiei", "Republica Moldova"));

        p2.addAdditionalInfo("hobby ", new Hobbies("Football", 3, "Stadionul FCSB"));
        p2.addAdditionalInfo("employment ", new EmploymentStatus(false));
        p2.addAdditionalInfo("student ", new Student(true));
        p2.addAdditionalInfo("lives in ", new LiviesIn("Strada Independentei", "Romania"));

        System.out.println(p1.toStringWithAdditionalInfo());
    }
}