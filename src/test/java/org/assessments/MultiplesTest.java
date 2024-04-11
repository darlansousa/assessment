package org.assessments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MultiplesTest {

    @Test
    void shouldSumMultiples() {
        assertEquals(23, Multiples.sum(10));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberIsZero() {
        assertThrows(IllegalArgumentException.class, () -> Multiples.sum(0));
    }

}