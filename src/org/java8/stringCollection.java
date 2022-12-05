package org.java8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;

public class stringCollection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        System.out.println("Enter five name:-  ");
        for(int i=0;i<5;i++){
            list.add(sc.next());
        }
        list.stream().filter(n->n.startsWith("S")).map(x->x+" Moris").sorted().forEach(System.out::println);
//        Stream<String> StringStrm= list.stream().filter(listF->listF.startsWith("S"));
//        StringStrm.forEach(n->n+"sera");

//        StringStrm.filter((System.out.prinln(list.forEach(str-> StringStrm.anyMatch(str::startsWith)));
//        Stream<String>sfinal= StringStrm.map(list.forEach(listd->System.out.println(listd+"d")));
    }
}
