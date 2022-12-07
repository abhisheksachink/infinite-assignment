package org.thread;

public class tableSynchronizeTest {
    public static void main(String[] args){
        tableSynchronize ts=new tableSynchronize();
        tableSynchronizeImpl tsi1= new tableSynchronizeImpl(ts,5);
        tableSynchronizeImpl tsi2= new tableSynchronizeImpl(ts,8);
    }
}
