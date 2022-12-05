package org.java8;
// Create a method with variable arguments where if no parameter is passed
// then a welcome message will be displayed.
// for single parameter: add 10 and display
// for two parameters: average of the numbers
// for three parameters: sum of the numbers

public class sample {
    public static void main(String[] args){
        sample s1=new sample();
        s1.getResult();
        s1.getResult(3);
        s1.getResult(2,4);
        s1.getResult(3,4,23);

    }
    void getResult(int... value){
        if(value.length==0){
            System.out.println("Welcome to Infinite");
        }
        if(value.length==1){
            System.out.println("No. addition with 10 in given no. is "+(value[0]+10));
        }
        if(value.length==2){
            System.out.println("the avg of no. is"+ ((value[0]+value[1])/value.length));
        }
        if(value.length==3){
            System.out.println("the sum of number is- "+(value[0]+value[1]+value[2]));
        }
    }

}
