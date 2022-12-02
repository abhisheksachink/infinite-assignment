package org.collection;

import java.util.Objects;

public class Employee implements Cloneable, Comparable<Employee>{
    private int empId;
    private String empName;
    private String department;
    private double salary;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }







    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee empl = (Employee) o;
        return salary == empl.salary && Objects.equals(salary, empl.salary);
    }
    public int hashCode() {
        return (int) this.salary;
    }
    @Override
    public int compareTo(Employee o) {
        if(this.salary > o.getSalary()){
            return 1;
        }
        else if(this.salary < o.getSalary()){
            return -1;
        }
        else{
            return 0;
        }

    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
