package org.collection;

public class Student {
    private int StudentId;
    private String StudentName;
    private  int age;
    private String CollegeName;

    public Student(int studentId, String studentName, int age, String collegeName) {
        StudentId = studentId;
        StudentName = studentName;
        this.age = age;
        CollegeName = collegeName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", age=" + age +
                ", CollegeName='" + CollegeName + '\'' +
                '}';
    }
}
