package org.assessments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void shouldReturnFactorialOf5() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void shouldThrowExceptionWhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
    }

}