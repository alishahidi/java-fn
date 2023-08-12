package org.alishahidi.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int number = incrementByOneFunction.andThen(multiplyBy10).apply(3);
        System.out.println(number);

        System.out.println(incrementAndMultiplyByValue.apply(2, 6));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    static Function<Integer, Integer> incrementAndMultiply = incrementByOneFunction.andThen(multiplyBy10);
    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyByValue = (number, multiplyBy) -> incrementByOneFunction.apply(number) * multiplyBy;
}
