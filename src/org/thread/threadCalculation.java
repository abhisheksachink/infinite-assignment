package org.thread;

public class threadCalculation implements Runnable{
    String threadName;
    Thread t;

    public threadCalculation(String threadName) {
        this.threadName = threadName;
        t= new Thread(this,this.threadName);
        System.out.println("Created Thread - "+t);
        t.start();
    }
    public void run(){
        if(t.getName()=="ADD"){
            int a=2,b=3;
            System.out.println("the addition of two no. is:- "+(a+b));
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("ADD Thread Exiting....");  // Thread is terminated


        }
        if(t.getName()=="SUBTRACT"){
            int a=7,b=3;
            System.out.println("the Substraction of two no. is:- "+(a-b));
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("SUBTRACT Thread Exiting....");  // Thread is terminated
        }
        if(t.getName()=="MULTIPLY"){
            int a=2,b=3;
            System.out.println("the Multiplication of two no. is:- "+(a*b));
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("MULTIPLY Thread Exiting....");  // Thread is terminated
        }

    }
}