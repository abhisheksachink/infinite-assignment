package org.example;
import java.util.Scanner;
public class emailTest {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your email and name:-  ");
        email[] Email=new email[4];
        email[] gmail = new email[4];
        email[] yahoo = new email[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter your email addrrss:- ");
            String emailAdrs= sc.next();
            System.out.println("Enter your name: ");
            String name= sc.next();
            Email[i]= new email(emailAdrs,name);

        }
        int k=0,p=0;
        for (int i=0; i<4; i++){
            if(Email[i].getEmail().contains("gmail")){
                gmail[k]=Email[i];
                k++;

            }
            if(Email[i].getEmail().contains("yahoo")){
                yahoo[p]=Email[i];
                p++;

            }

        }
        for(int i=0;i<4;i++){
            System.out.println(gmail[i]);
        }
        for(int i=0;i<4;i++){
            System.out.println(yahoo[i]);
        }
    }
}
