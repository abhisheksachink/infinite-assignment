package org.thread;

public class tableSynchronizeImpl implements Runnable{
    int value;
    tableSynchronize ts;
    Thread t;

    public tableSynchronizeImpl(tableSynchronize ts,int value) {
        this.value = value;
        this.ts=ts;
        t=new Thread(this);
        System.out.println(t.getName());
        t.start();

    }

    @Override
    public void run() {
        ts.tableCalculate(value);
    }
}
