package org.assessments;

import java.util.stream.IntStream;

public class Multiples {
    public static int sum(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        return IntStream.range(1, number).filter(value -> (value % 3 == 0 || value % 5 == 0)).sum();
    }
}
