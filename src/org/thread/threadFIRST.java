package org.thread;

public class threadFIRST implements Runnable{
    Thread t1;
    Thread t2;
    public threadFIRST(){
//        this.t = t;
        t1= new Thread(this,"FirstThread");
        t2= new Thread(this,"SecondThread");
        System.out.println("Created Thread - "+t1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("first thread is alive"+t1.isAlive());
        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }

    @Override
    public void run() {
        if(t1.isAlive()){
            try{
                System.out.println("The table of 5 is:- ");
                for(int i=1; i<=10;i++){
                    System.out.println("5 * "+i+"="+(i*5));
                    Thread.sleep(2000);
                }
                System.out.println("Table 5 is End....");
              //  t1.join();


            }
            catch  (InterruptedException e){
                e.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

        if(!(t1.isAlive())){
            try{
                System.out.println("The table of 8 is:- ");
                for(int i=1; i<=10;i++){
                    System.out.println("8 * "+i+"="+(i*8));
                    Thread.sleep(2000);
                }
               // t2.join();

            }
            catch  (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

}
