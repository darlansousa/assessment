package org.assessments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void shouldSort() {
        int[] vector = {0, 12, 2, 3, 10};
        int[] expected = {0, 2, 3, 10, 12};
        BubbleSort.sort(vector);
        assertArrayEquals(expected, vector);
    }

}