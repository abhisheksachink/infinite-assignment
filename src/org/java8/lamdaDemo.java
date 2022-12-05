package org.java8;

//Write lambda expressions that will return BiPredicate, Supplier, IntConsumer, DoubleFunction

import java.util.function.BiPredicate;
import java.util.function.DoubleFunction;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class lamdaDemo {
    public static void main(String[] args){
        MyInterface obj =(a , b) ->{
            if(a>b)return a;
            else return b;
        };
        System.out.println(obj.greter(6,7));

        //Bipredicate Uses
        BiPredicate < Integer, Integer > biPredicate = (x, y) -> x > y;
        System.out.println("If x>y its gives true :-"+biPredicate.test(2,0));

        //Supplier uses
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random between 0 and 1:- "+randomValue.get());

        IntConsumer ic=(x)->System.out.println(x+" is greater than 0 ");
        ic.accept(10);

        DoubleFunction<Double> ob = a -> (a * 10);
        System.out.println(ob.apply(3.2));
    }
}
