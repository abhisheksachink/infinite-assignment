package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Library {

    Library(int membId,String MemberName, String Address){
        AddMember(membId,MemberName,Address);
    }
    Library(int id){
        RemoveMember(id);
    }

    List<Member> memb=new ArrayList<>();

    public void AddMember(int membId,String MemberName, String Address){
//        Member m1=new Member(membId,MemberName,Address);
        memb.add(new Member(membId,MemberName,Address));
        System.out.println(memb.toString());

    }

    public void RemoveMember(int membId){

//        Member m1=new Member(memb.remove()));
        System.out.println(memb.toString());

    }
    public void SearchMember(){

    }




}
