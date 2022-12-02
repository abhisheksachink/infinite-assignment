package org.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Prob1 {
    public static void main(String[] args){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number.add(1);
        Number.add(2);
        Number.add(4);
        Number.add(5);
        Number.add(6);
        System.out.println("The sum of odd value is");
//        Iterator itr =Number.iterator();
        int sum=0;
        for (Integer e : Number) {
            if(e%2!=0){
                sum=sum+e;
//                System.out.println(e);
            }

        }
        System.out.println(sum);


        ArrayList<String> Employee =new ArrayList<>();
        Employee.add("Abhi");
        Employee.add("Sah");
        Employee.add("ram");
        Employee.add("Sita");

        Employee.add(2,"Simpi");

        System.out.println(Employee);
        System.out.println("Employee Start with S -");
        for (String s : Employee) {
            if(s.startsWith("S")){
                System.out.println(s);
            }

        }

     }
}
