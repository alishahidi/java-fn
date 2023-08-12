package org.alishahidi.functionalinterface;

import java.util.*;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(
                1,
                2,
                3
        );

        stream.forEach(System.out::println);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        list.stream().filter(element -> {
            System.out.println("Filter() was called.");
            return element.contains("a");
        }).map(element -> {
            System.out.println("Map() was called.");
            return element.toUpperCase();
        }).forEach(System.out::println);

        System.out.println("-----------Order of Execution-----------");
        long size = list.stream().skip(2).filter(s -> {
            System.out.println("Filter(1) was called.");
            return s.contains("a");
        }).count();

        System.out.println(size);

        System.out.println(
                list.stream()
                        .allMatch(s -> s.contains("2"))
        );

        Optional<String> optionalReducer = list.stream()
                        .reduce((s, s2) -> s + ", " + s2);

        System.out.println(optionalReducer.get());


        Comparator<Integer> getMin = (integer, t1) -> {
            return integer - t1;
        };
        List<Integer> numbers = new ArrayList<>(List.of(
                1, 2, 3, 6, 8, 9
        ));
        Optional<Integer> minNum = numbers.stream().min(getMin);
        minNum.ifPresent(System.out::println);
    }
}
