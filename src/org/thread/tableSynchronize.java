package org.thread;

public class tableSynchronize {
    synchronized void tableCalculate(int a){
        System.out.println("The table of "+a+" is:- ");
        for(int i=1; i<=10;i++){
            System.out.println(a+"*"+i+"="+(i*a));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {

            if(Thread.activeCount()>3){//this for sleep only between method and after all method sleep not call
            //System.out.println("active"+ Thread.activeCount());
            Thread.sleep(5000);}
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
//    synchronized void table2Calculate(){
//        System.out.println("The table of 8 is:- ");
//        for(int i=1; i<=10;i++){
//            System.out.println("8 * "+i+"="+(i*8));
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
}
