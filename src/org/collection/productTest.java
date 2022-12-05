package org.collection;

import org.java8.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class productTest {
    public static void main(String[] args){
        List<product> products= new ArrayList<>();
        product p1=new product(12,"SamsungNote","Electronic",1200);
        product p2=new product(17,"Glass","Utensil",20);
        product p3=new product(13,"CromaIron","Electronic",300);
        product p4=new product(19,"Iphone","Electronic",5000);
        product p5=new product(21,"Plate","Utensil",100);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);


        List<product> products1=products.stream().filter(n->n.getCategory().equalsIgnoreCase("Electronics")).collect(Collectors.toList());
//        List<Double> price = products1.stream().toArray().
        products.stream().filter(k->k.getPrice()<500).forEach(System.out::println);




    }
}
