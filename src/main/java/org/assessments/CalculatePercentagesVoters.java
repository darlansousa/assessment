package org.assessments;

import java.util.stream.Stream;

public class CalculatePercentagesVoters {
    private final int totalVoters;
    private final int validVotes;
    private final int whiteVotes;
    private final int nullVotes;

    CalculatePercentagesVoters(int totalVoters, int validVotes, int whiteVotes, int nullVotes) {
        if (totalVoters <= 0) {
            throw new IllegalArgumentException("Total voters must be greater than 0");
        }
        this.totalVoters = totalVoters;

        if (Stream.of(validVotes, whiteVotes, nullVotes).anyMatch(votes -> votes < 0)) {
            throw new IllegalArgumentException("Votes must be greater than or equal to 0");
        }

        if (validVotes + whiteVotes + nullVotes != totalVoters) {
            throw new IllegalArgumentException("Votes must be equal to total voters");
        }

        this.validVotes = validVotes;
        this.whiteVotes = whiteVotes;
        this.nullVotes = nullVotes;
    }

    public int getValidVotesPercentage() {
        return calculatePercentage(validVotes);
    }

    public int getWhiteVotesPercentage() {
        return calculatePercentage(whiteVotes);
    }

    public int getNullVotesPercentage() {
        return calculatePercentage(nullVotes);
    }

    private int calculatePercentage(int votes) {
        return (votes * 100) / totalVoters;
    }
}
