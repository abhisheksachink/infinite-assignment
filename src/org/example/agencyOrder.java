package org.example;
import java.util.Scanner;
public class agencyOrder {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The item which you wants to purchege:-");
        String itemName=sc.next();
        System.out.println("Enter The quantity");
        int quantity=sc.nextInt();

        if(itemName.startsWith("Induction")){
            inductionOrder(itemName,quantity);

        }
        if(itemName.startsWith("Electric")){
            electricOrder(itemName,quantity);

        }

    }
    public static void inductionOrder(String item, int quantity){
        if(quantity>30){
            if(quantity<50){
                System.out.println("the Item Name is:- "+ item);
                System.out.println("The quantity is:- "+quantity);
                System.out.println("Total Price is:- "+quantity*900);

            }
            if(quantity>50){
                System.out.println("the Item Name is:- "+ item);
                System.out.println("The quantity is:- "+quantity);
                System.out.println("Total Price is:- "+quantity*850);
            }
        }
        if(quantity<30){
            System.out.println("the Item Name is:- "+ item);
            System.out.println("The quantity is:- "+quantity);
            System.out.println("Total Price is:- "+quantity*950);
        }



    }
    public static void electricOrder(String item, int quantity){
        if(quantity>30){
            if(quantity<50){
                System.out.println("the Item Name is:- "+ item);
                System.out.println("The quantity is:- "+quantity);
                System.out.println("Total Price is:- "+quantity*700);

            }
            if(quantity>50){
                System.out.println("the Item Name is:- "+ item);
                System.out.println("The quantity is:- "+quantity);
                System.out.println("Total Price is:- "+quantity*800);
            }
        }
        if(quantity<30){
            System.out.println("the Item Name is:- "+ item);
            System.out.println("The quantity is:- "+quantity);
            System.out.println("Total Price is:- "+quantity*900);
        }


    }


}
