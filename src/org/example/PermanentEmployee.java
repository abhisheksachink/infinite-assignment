package org.example;

public class PermanentEmployee extends EmployeeE{
    double pfPercent;

    @Override
    public String getEmployeeInfo() {
        pfPercent= 0.12*salary;
        netSalary=salary-pfPercent;
        return "pf is "+pfPercent+" salary is "+salary +" net salary is "+ netSalary;

    }


}
