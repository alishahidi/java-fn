package org.alishahidi.functionalinterface;

import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(
                1,
                2,
                3
        );

        stream.forEach(System.out::println);
    }
}
