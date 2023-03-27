package org.example.kyu6;

import org.example.kyu8.Cycling;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class SortTheOddTest {

    SortTheOdd sortTheOdd = new SortTheOdd();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{ 1, 3, 2, 8, 5, 4 }, new int[]{ 5, 3, 2, 8, 1, 4 }),
                of(new int[]{ 1, 3, 5, 8, 0 }, new int[]{ 1, 3, 5, 8, 0 }),
                of(new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sort(int[] expected, int[] array) {
        int[] result = sortTheOdd.sort(array);
        assertArrayEquals(expected, result);
    }
}