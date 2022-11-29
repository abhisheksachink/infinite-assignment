package org.example;
import java.util.*;
public class courseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        course Course1 = new course("Java", 01, 1000);
        course Course2 = new course("FullStack", 02,2000);
        course Course3 = new course("Python", 03,3000);
        course Course4 = new course("C++", 04,1211);
        course Course5 = new course("C#", 05,1311);

        System.out.println("Enter the Option 1 for searching by Course Id and Option2 for Course name");
        int choice = sc.nextInt();
        String Cname = null;
        int Cid = 0;
        if (choice == 1) {
            System.out.println("Enter the course id for Search");
            Cid = sc.nextInt();
        } else {
            System.out.println("Enter the Course Name for Search");
            Cname = sc.next();
        }


        if (Course1.getCourseName().equalsIgnoreCase(Cname)) {
            System.out.println("Course is Available");
            System.out.println(Course1.toString());
        }
        if (Course2.getCourseName().equalsIgnoreCase(Cname)) {
            System.out.println("Course is Available");
            System.out.println(Course2.toString());
        }
        if (Course3.getCourseName().equalsIgnoreCase(Cname)) {
            System.out.println("Course is Available");
            System.out.println(Course3.toString());
        }
        if (Course4.getCourseName().equalsIgnoreCase(Cname)) {
            System.out.println("Course is Available");
            System.out.println(Course4.toString());
        }
        if (Course5.getCourseName().equalsIgnoreCase(Cname)) {
            System.out.println("Course is Available");
            System.out.println(Course5.toString());
        }
        if (Course1.getCourseId()== Cid) {
            System.out.println("Course is Available");
            System.out.println(Course1.toString());
        }
        if (Course2.getCourseId() == Cid) {
            System.out.println("Course is Available");
            System.out.println(Course2.toString());
        }
        if (Course3.getCourseId() == Cid) {
            System.out.println("Course is Available");
            System.out.println(Course3.toString());
        }
        if (Course4.getCourseId() == Cid) {
            System.out.println("Course is Available");
            System.out.println(Course4.toString());
        }
        if (Course5.getCourseId() == Cid) {
            System.out.println("Course is Available");
            System.out.println(Course5.toString());
        }
        else {
            System.out.println("Course Not Found");
        }


    }
}
