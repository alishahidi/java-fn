package org.alishahidi.streams;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class _ParallelStream {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(0, 100)
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        IntStream.range(0, 100)
                .parallel()
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream: " + (end - start) + " ms");
    }
}
