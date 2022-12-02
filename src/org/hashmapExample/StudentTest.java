package org.hashmapExample;

import java.util.*;

public class StudentTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student("Abhi",01,'C');
        Student s2=new Student("Ram",02,'A');
        Student s3=new Student("Sita",03,'B');
        Student s4=new Student("gita",04,'A');

        List<Student> stdList= new ArrayList<>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);
        stdList.add(s4);

        Map<Integer, List<Student>> stdMap= new HashMap<>();

//        for(Map.Entry<Integer, String > entry : stdMap.entrySet());
//        for()


    }
}
