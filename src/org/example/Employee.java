package org.example;

public class Employee {
    public static void main(String[] args){
        //private  employeeId;

        Employee1 emp=new Employee1();
        emp.setEmpId(23);
        emp.setEmpName("Abhi");
        emp.setDesignation("manager");
        emp.setHoursWorked(8);



        Employee1 emp1=new Employee1();
        emp1.setEmpId(24);
        emp1.setEmpName("Abhinav");
        emp1.setDesignation("consultant");
        emp1.setHoursWorked(8);


        Employee1 emp3=new Employee1();
        emp3.setEmpId(23);
        emp3.setEmpName("ranjeet");
        emp3.setDesignation("trainee");
        emp3.setHoursWorked(8);




        emp.getEmpId();
        emp.getEmpName();
        emp.getDesignation();
        emp.getHoursWorked();
        emp.getSalary();

        emp1.getEmpId();
        emp1.getEmpName();
        emp1.getDesignation();
        emp1.getHoursWorked();
        emp1.getSalary();

        emp3.getEmpId();
        emp3.getEmpName();
        emp3.getDesignation();
        emp3.getHoursWorked();
        emp3.getSalary();

    }
}
class Employee1{

    private int empId;
    private String empName;
    private String designation;
    private int hoursWorked;
    private int salary;

    public int getEmpId() {
        System.out.println(empId);
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        System.out.println(empName);
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        System.out.println(designation);
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getHoursWorked() {
        System.out.println(hoursWorked);
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {

            this.hoursWorked = hoursWorked;


    }

    public int getSalary() {
        if (designation.equals("manager")){
            System.out.println(2000*hoursWorked);
        }
        if (designation.equals("trainee")){
            System.out.println(500*hoursWorked);
        }
        if (designation.equals("developer")){
            System.out.println(1000*hoursWorked);
        }
        if (designation.equals("consultant")){
            System.out.println(1500*hoursWorked);
        }

        return salary*hoursWorked;
    }

    public void setSalary(int salary) {

            this.salary=salary;
    }
}
