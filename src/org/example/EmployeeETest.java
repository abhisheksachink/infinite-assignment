package org.example;

public class EmployeeETest {
    public static void main(String[] args){
        EmployeeE emp1 =new PermanentEmployee();
        emp1.salary=1000;
        emp1.netSalary=1500;
        System.out.println(emp1.getEmployeeInfo());

    }
}
