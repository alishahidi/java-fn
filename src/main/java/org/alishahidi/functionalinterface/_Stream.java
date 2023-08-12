package org.alishahidi.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
    }
}
