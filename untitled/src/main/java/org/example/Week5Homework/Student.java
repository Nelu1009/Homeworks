package org.example.Week5Homework;

public class Student {
    private final boolean studying;

    public Student(boolean isStuyding) {
        this.studying = isStuyding;
    }

    public boolean getStudying() {
        return studying;
    }

    @Override
    public String toString() {
        return (studying ? " studying" : " not studying");
    }
}