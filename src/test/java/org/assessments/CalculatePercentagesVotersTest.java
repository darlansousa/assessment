package org.assessments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePercentagesVotersTest {

    @Test
    void shouldReturnValidVotesPercentage() {
        final var calculatePercentagesVoters = new CalculatePercentagesVoters(
                100,
                80,
                10,
                10);
        assertEquals(80, calculatePercentagesVoters.getValidVotesPercentage());
    }

    @Test
    void shouldReturnWhiteVotesPercentage() {
        final var calculatePercentagesVoters = new CalculatePercentagesVoters(
                100,
                80,
                10,
                10);
        assertEquals(10, calculatePercentagesVoters.getWhiteVotesPercentage());
    }

    @Test
    void shouldReturnNullVotesPercentage() {
        final var calculatePercentagesVoters = new CalculatePercentagesVoters(
                100,
                80,
                10,
                10);
        assertEquals(10, calculatePercentagesVoters.getNullVotesPercentage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTotalVotersIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new CalculatePercentagesVoters(
                0,
                80,
                10,
                10));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenValidVotesIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new CalculatePercentagesVoters(
                1000,
                0,
                10,
                10));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenWhiteVotesIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new CalculatePercentagesVoters(
                1000,
                100,
                0,
                10));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNullVotesIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new CalculatePercentagesVoters(
                1000,
                100,
                10,
                0));
    }


    @Test
    void shouldThrowIllegalArgumentExceptionWhenTotalVotersIsLessThenTotalOfVotes() {
        assertThrows(IllegalArgumentException.class, () -> new CalculatePercentagesVoters(
                1000,
                10000,
                10,
                10));
    }

}