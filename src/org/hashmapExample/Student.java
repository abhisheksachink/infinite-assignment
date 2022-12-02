package org.hashmapExample;

public class Student {
    private String studName;
    private int Roll;
    private char grade;

    public Student(String studName, int roll, char grade) {
        this.studName = studName;
        Roll = roll;
        this.grade = grade;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", Roll=" + Roll +
                ", grade=" + grade +
                '}';
    }
}
