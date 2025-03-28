package org.example.homework;

public class EmploymentStatus {
    private final boolean isHired;

    public EmploymentStatus(boolean isHired) {
        this.isHired = isHired;
    }

    public boolean isHired() {
        return isHired;
    }

    @Override
    public String toString() {
        return (isHired ? " hired" : " unemployed");
    }
}
