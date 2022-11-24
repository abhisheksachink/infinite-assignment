package org.example;

public class Add {
    public static void main(String[] args){
        
        int num1=12;
        int num2=3;
        int result=num1+num2;
        System.out.println("the sum is "+result);
    }
    public int getSum(int a, int b){
        int num1=a;
        int num2=b;
        int result=num1+num2;
        System.out.println("the sum is "+result);
        return num1+num2;

    }
}
