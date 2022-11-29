package org.example;

public class EmployeeE {
    EmployeeE(int employeeId, String employeeName, int employeeAge){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;

    }
    EmployeeE(){

    }
    String empName;
    private int employeeId;
    private String employeeName;
    private int employeeAge;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    double salary;
    double netSalary;
    public String getEmployeeInfo(){
        return salary +" "+ netSalary;
    }
}
