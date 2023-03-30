package org.example.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class RotationsTest {


    Rotations rotations = new Rotations();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", List.of(), true),
                of("", List.of("bsjq", "qbsj"), true),
                of("bsjq", List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"), true),
                of("XjYABhR", List.of("TzYxlgfnhf",
                        "yqVAuoLjMLy",
                        "BhRXjYA",
                        "YABhRXj",
                        "hRXjYAB",
                        "jYABhRX",
                        "XjYABhR",
                        "ABhRXjY"), false)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void containsAllRotations(String input, List<String> inputArr, boolean expected) {
        boolean result = rotations.containsAllRotations(input, inputArr);
        assertEquals(expected, result);
    }
}