package org.collection;
import com.sun.source.tree.NewArrayTree;
import org.example.Add;

import java.util.Scanner;
public class MemberTest {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Enter 1 for add, 2 for Delete and 3 for Search 4 for Quit:-");
            int choice= sc.nextInt();
            if(choice==1){
                System.out.println("Enter member Id:- ");
                int memberId= sc.nextInt();
                System.out.println("Enter member Name:- ");
                String memberName= sc.next();
                System.out.println("Enter Address:- ");
                String address= sc.next();
                Library lib = new Library(01, "Abhi", "vizag");
                lib.AddMember(memberId, memberName, address);



            }
            if(choice==2){
                System.out.println("Enter Id to remove Member");
                int id=sc.nextInt();
                Library lib1=new Library(id);
                lib1.RemoveMember(id);

            }
            if(choice==3){

            }
            if(choice==4){
                break;
            }

        }

    }

}
