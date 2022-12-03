package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Member> memberList = new ArrayList<>();

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member) {
        memberList.add(member);

    }

    public void removeMember(Member member) {
        memberList.remove(member);
    }

    public Member searchMember(int id) {
        Member searchedMember = new Member();
        boolean flag = false;
        for (Member member : memberList) {
            if (member.getMemberId() == id) {
                searchedMember = member;
                flag = true;
            }
        }
        if (flag)
            return searchedMember;
//            return searchedMember;
        else
            return null;



    }

}





