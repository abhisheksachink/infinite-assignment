package org.example;
import java.util.Scanner;
public class nameArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name= new String[5];
        String[] nameNew =new String[5];
        for(int i=0,j=0; i<5; i++){
            name[i]=sc.next();
            if(name[i].startsWith("A")){
                nameNew[j]=name[i];
                j++;
            }

        }
        for(int i=0; i<5; i++){
            System.out.println(name[i]);
        }
        for(int i=0; i<nameNew.length; i++){
            System.out.println(nameNew[i]);
        }

    }
}
