package org.collection;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args){
        List<Employee> empl =new ArrayList<>();

        Employee e1=new Employee(01,"Abhi","Java Dev",2000);
        Employee e2= new Employee(02,"Ram","ASE",500);
        Employee e3=new Employee(03,"Shyam","Testing",1000);

        empl.add(e1);
        empl.add(e2);
        empl.add(e3);
//        empl.set(2,)

        Collections.sort(empl, Collections.reverseOrder());
        for(Employee employee:empl){
        System.out.println(employee.toString());
        }
    }


//        for(Employee employee:){
//        System.out.println(empl.toString());
//        }

    }

