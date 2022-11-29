package org.example;

public class studentArray {
    public static void main(String[] args){



        Student1[] s=new Student1[3];
        s[0] = new Student1("A", "Abhishek");
        s[1]=new Student1("B", "Ramu");
        s[2]=new Student1("A","Abhishek");
        if(s[0].toString()=="A"){
            System.out.println(s[2].toString());
        }
        //System.out.println(s[2].toString());



    }
    }

