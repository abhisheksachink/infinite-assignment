package org.exceptionHandling;
import java.util.Scanner;
public class StudentTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student id:-");
        int id=sc.nextInt();
        System.out.println("Enter Student Name");
        String name= sc.nextLine();
        System.out.println("Please enter your grade:-");
        Character grade=sc.next().charAt(0);

        Student[] studentArr=new Student[5];
        Student student=new Student(01,"Abhi",'A');
        studentArr[0]=student;
        //Student s1 = new Student(id,name,grade);



        try{
            for(int i=1;i<5;i++){
                Student student1=new Student(id,name,grade);
                studentArr[i]=student1;
                if(studentArr[i-1].getId()== studentArr[i].getId()){
                    throw new MyException("USERID ALREADY EXIST");
                }
            }


        }
        catch(MyException e){
            System.out.println(e);
            System.out.println(student.toString());
        }

    }
}
