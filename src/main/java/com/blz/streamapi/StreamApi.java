package com.blz.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(68);
        list.add(1);
        list.add(5);
        // creating stream  and Iterate the Each item to show each element of stream
        list.stream().forEach(value -> System.out.println(value));

        //converting into double

        list.stream()
                .map(value -> value.doubleValue())
                .forEach(value -> System.out.println(value));
        //new list for double values
        List<Double> doubleList1 = list.stream()
                .map(n -> n.doubleValue())
                .collect(Collectors.toList());
        System.out.println(doubleList1);
// Filter the even numbers
        Predicate<Integer> isEvenFunction = n -> n % 2 == 0;
        List<Integer> evenList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);

        List<Double> evenAndDoubleList = list.stream()
                .map(n -> n.doubleValue())
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenAndDoubleList);


    }
}




