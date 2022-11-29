package org.example;

public class Student1 {
    private String grade;
    private String name;
    public Student1(String grade, String name){
        this.grade=grade;
        this.name=name;
    }
    public String toString() {

        return grade  +  name;
    }
}
