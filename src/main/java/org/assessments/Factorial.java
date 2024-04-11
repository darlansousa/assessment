package org.assessments;

import java.util.stream.LongStream;

public class Factorial {

    public static long calculate(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0");
        }
        return LongStream.rangeClosed(1, number).reduce(1, (long x, long y) -> x * y);
    }
}
