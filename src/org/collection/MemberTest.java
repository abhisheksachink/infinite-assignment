package org.collection;
import com.sun.source.tree.NewArrayTree;
import org.example.Add;

import java.util.Scanner;
public class MemberTest {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Library l1=new Library();

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

                l1.addMember(new Member(memberId,memberName,address));
                System.out.println(l1.getMemberList());
            }
            if(choice==2){
                System.out.println("Enter Id to remove Member");
                int id=sc.nextInt();
                Member member=l1.searchMember(id);
                l1.removeMember(member);
                System.out.println(l1.getMemberList());

            }
            if(choice==3){
                System.out.println("Enter Id for search");
                int id=sc.nextInt();
                System.out.println(l1.searchMember(id));
            }
            if(choice==4){
                break;
            }

        }

    }

}
