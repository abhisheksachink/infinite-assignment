package org.exceptionHandling;

public class Candidate {
    private String name;
    private Character gender;
    private double salary;
    Candidate(String name, Character gender, double salary){
        this.gender=gender;
        this.name=name;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
