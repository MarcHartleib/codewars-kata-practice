package org.example.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class SortNumberTest {

    SortNumber sortNumber = new SortNumber();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, 0),
                of(21, 12),
                of(321, 123),
                of(987654321, 123456789)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sortDescOrder(int expected, int number) {
        int result = sortNumber.sortDescOrder(number);
        assertEquals(expected, result);
    }
}