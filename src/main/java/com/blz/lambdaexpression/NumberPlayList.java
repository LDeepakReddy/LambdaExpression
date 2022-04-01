package com.blz.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(5);

        for (Integer numList : list) {
            System.out.println(numList);
        }
        //Traversing using Iterator
        System.out.println("Traversng through Iterator :  ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("Iterator value : " + i);
        }
        //Traversing Using Consumer interface Implementation
        System.out.println("Traversing Through Consumer Implementation");
        MyConsumer action = new MyConsumer();
        list.forEach(action);

        //traversing with Anonymous Consumer interface implementation
        System.out.println("traversing through Anonymous Consumer interface implementation");
        list.forEach(new Consumer<Integer>() {
                         public void accept(Integer value) {
                             System.out.println(value);
                         }
                     }
        );

        // Explicit lambda
        System.out.println("traverse through Explicit Lambda");
        Consumer<Integer> myListAction = n -> {
            System.out.println("Lambda List values: " + n);
        };
        list.forEach(myListAction);

        //  Implicit lambda function
        System.out.println("traverse through Implicit lambda function");
        list.forEach(value -> System.out.println("Values in list " + value));
        //converting integer into double
        Function<Integer, Double> doubleFunction = (n) -> n.doubleValue();
        list.forEach(item -> System.out.println(" Integer Value to Double : " + doubleFunction.apply(item)));

        // Using predicate functional interface
        Predicate<Integer> isEvenFunction = (n) -> n % 2 == 0;
        list.forEach(value -> System.out.println(value +" is even : "+isEvenFunction.test(value)));
    }
}


