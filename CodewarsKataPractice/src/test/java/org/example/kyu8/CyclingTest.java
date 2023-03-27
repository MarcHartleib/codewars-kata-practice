package org.example.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class CyclingTest {

    Cycling cycling = new Cycling();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(1, 2),
                of(0, 0.97),
                of(7, 14.64),
                of(800, 1600.20),
                of(40, 80),
                of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void hydrate(int expected, double number) {
        int result = cycling.hydrate(number);
        assertEquals(expected, result);
    }

}