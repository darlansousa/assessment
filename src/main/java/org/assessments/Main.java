package org.assessments;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1) Calculating Votes");
        final var calculator = new CalculatePercentagesVoters(1000, 500, 200, 300);
        System.out.print("Percentage Valid Votes: ");
        System.out.println(calculator.getValidVotesPercentage());
        System.out.print("Percentage White Votes: ");
        System.out.println(calculator.getWhiteVotesPercentage());
        System.out.print("Percentage Null Votes: ");
        System.out.println(calculator.getNullVotesPercentage());

        System.out.println("2) Bubble Sort");
        int[] vector = {0, 12, 2, 3, 10};
        System.out.println("Before:");
        Arrays.stream(vector).forEach(num -> System.out.println(num + " "));
        BubbleSort.sort(vector);
        System.out.println("After:");
        Arrays.stream(vector).forEach(num -> System.out.println(num + " "));
        System.out.println("3) Factorial");
        System.out.printf("5 Factorial: %d%n", Factorial.calculate(5));

        System.out.println("4) Sum Multiples");
        System.out.printf("Sum of multiples from 10 is: %d%n", Multiples.sum(10));
    }
}