package org.thread;

public class threadCalculationTest {
    public static void main(String... args){
        //new ThreadDemo2();
        new threadCalculation("ADD");
        new threadCalculation("SUBTRACT");
        new threadCalculation("MULTIPLY");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Main Thread Exiting....");
    }
}
