package org.exceptionHandling;
import java.util.Scanner;

public class sample1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            int[] arr=new int[5];
            System.out.println("enter size for  array");
            int num=sc.nextInt();
            System.out.println("Enter the numbers for insert in array:-");
            for(int a=0;a<num;a++){
                arr[a]= sc.nextInt();
            }

            int[] arr1=new int[num];
            System.out.println("Enter the index number for search:-");
            int searchindex= sc.nextInt();
            int check=0;
            for(int i=0;i<arr1.length;i++){
                check = arr1[searchindex];

            }
            System.out.println(check);

        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Array index out of bound");
        }
        catch (Exception e){
            System.out.println("Exception Occured due to wrong input");
        }




    }
}
