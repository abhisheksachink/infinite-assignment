package org.java8;
import org.collection.Student;

//Create a collection of Student object then stream through it and filter out only the 'A' grade students.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args){
        List<student> students= new ArrayList<>();
        student s1=new student("Abhi",01,'A');
        student s2=new student("Ram",02,'B');
        student s3=new student("Sita",03,'C');
        student s4=new student("Sita",04,'A');
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

//        for (students:students){
//
//
//        }

//        students.stream().filter(n->n.getGrade()=='A').forEach(k->System.out.println(k));
        List<student> student1=students.stream().filter(n->n.getGrade()=='A').collect(Collectors.toList());
//        students.stream().;
        student1.stream().forEach(System.out::println);


    }
}
