package com.blz.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(22);
        list.add(9);
        list.add(12);
        list.add(68);
        list.add(1);
        list.add(5);
        list.add(155);

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
//show the first even number
        List<Integer> a = new ArrayList<Integer>();

        Integer firstValue = list.stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n))
                .findFirst()
                .orElse(3);
        System.out.println("First even Value is " + firstValue);
//Find Min and Max number
        Integer value = list.stream()
                .min(Comparator.comparing(n -> n.intValue()))
                .orElse(null);
        System.out.println("Minimum  number is " + value);

        Integer value1 = list.stream()
                .max((n1, n2) -> n1 - n2)
                .orElse(null);
        System.out.println("Maximum  Number is " + value1);

        //Sum And average
        Integer sum = 0;
        for (Integer num : list) {
            sum = sum + num;
        }

        list.stream().reduce(0, Integer::sum);

        Integer total = list.stream().reduce(0, (v1, v2) -> v1 + v2);
        System.out.println("Sum Of total " + total);
        Long length = list.stream().count();
        System.out.println("Total Elements in list " + length);
        System.out.println("Average  : " + total / length);

        //Find atleast one Even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(list.stream().allMatch(n -> n % 2 == 0));
        System.out.println(list.stream().noneMatch(n -> n % 2 == 0));
        System.out.println(list.stream().anyMatch(n -> n % 2 == 0));




    }
}




