package org.example.kyu4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class ParseIntTest {


    ParseInt parseInt = new ParseInt();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, "zero"),
                of(20, "twenty"),
                of(246, "two hundred forty-six"),
                of(7707, "seven thousand seven hundred seven")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void parseIntReloaded(int expected, String numberString) {
        int result = parseInt.parseIntReloaded(numberString);
        assertEquals(expected, result);
    }
}