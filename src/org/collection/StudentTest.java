package org.collection;
import java.util.*;

public class StudentTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Student s1=new Student()
        List<Student> student=new ArrayList<>();


        Student s1= new Student(01,"Abi",70,"ABC");
        Student s2= new Student(02,"Sai",43,"BC");
        Student S3= new Student(03,"Bai",100,"XYZ");
        Student S4= new Student(04,"Yes",15,"Don't No");
        Student s5= new Student(05,"No",20,"AZ");
        Student S6= new Student(06,"Yes-No",30,"ZA");
        Iterator itr =student.iterator();
        student.add(s1);
        student.add(s2);
        student.add(S3);
        student.add(S4);
        student.add(s5);
        student.add(S6);

//        List<Student>


//        System.out.println("Enter Your College Name:");
//        String ClgName=sc.next();
//        if(student.equals()==ClgName){
//            System.out.println(student.toString());
//
//        }



    }
}
