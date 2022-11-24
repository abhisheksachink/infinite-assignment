package org.example;
import java.util.Scanner;
public class loop {
    public static void main(String[] args){
//        int i=1;
//        while(i<=10){
//            System.out.println("5*"+i+"="+5*i);
//            i++;
//        }
        Scanner sc=new Scanner(System.in);
        int count=1;
        int result=7;
        while(result==7){
            int lucky=sc.nextInt();

            if(result==lucky){
                System.out.println("Great! you have guessed in right in "+count+" attempts.");
                break;
            }
            else
                System.out.println("Not Really! Please Try Again!!");
            count++;
            //continue;


        }

    }

}
