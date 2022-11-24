package org.example;

public class Employe {
    //First Constructor
    public Employe(int empId, String empName){
        //NORMALLY WE SET THE VALUE IN CONSTRUCTOR
        //int employeId;
        System.out.println(empId);
        System.out.println(empName);
       // this.employeId=empId;


    }
    //Second Constructor
    public Employe(int empId, String empName, String designation){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(designation);

    }
    public static void main(String[] args){
        Employe emp1=new Employe(12, "Abhi");
        Employe emp2=new Employe(13,"Ram","Manager");


    }
}
