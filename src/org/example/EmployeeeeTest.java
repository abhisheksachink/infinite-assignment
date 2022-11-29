package org.example;

public class EmployeeeeTest {
    public static void main(String[] args){
        EmployeeE emp1=new EmployeeE(101,"Abhi",18);
        EmployeeE emp2=new EmployeeE(102,"Ram",21);
        EmployeeE emp3=new EmployeeE(103,"Shyam",22);
        EmployeeE emp4=new EmployeeE(104,"Ravi",19);
        EmployeeE emp5=new EmployeeE(105,"Bipin",34);

        int avgAge= (emp1.getEmployeeAge()+emp2.getEmployeeAge()+emp3.getEmployeeAge()+emp4.getEmployeeAge()+emp5.getEmployeeAge())/5;
        System.out.println("the average age of all employee is "+avgAge);
    }
}
