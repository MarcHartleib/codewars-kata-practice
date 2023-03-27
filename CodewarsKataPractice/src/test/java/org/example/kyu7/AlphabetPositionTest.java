package org.example.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class AlphabetPositionTest {

    AlphabetPosition alphabetPosition = new AlphabetPosition();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{1}, new String[]{"a"}),
                of(new int[]{0}, new String[]{""}),
                of(new int[]{26, 0}, new String[]{"abcdefGhijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgFedcba"}),
                of(new int[]{4, 3, 1}, new String[]{"abode", "ABc", "xyzD"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findPositions(int[] expected, String[] letterArray) {
        int[] result = alphabetPosition.findPositions(letterArray);
        assertArrayEquals(expected, result);
    }
}