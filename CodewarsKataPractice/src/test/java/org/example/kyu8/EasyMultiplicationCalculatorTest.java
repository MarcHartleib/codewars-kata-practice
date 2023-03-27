package org.example.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EasyMultiplicationCalculatorTest {
    EasyMultiplicationCalculator easyMultiplicationCalculator = new EasyMultiplicationCalculator();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(9, 1),
                of(27, 3),
                of(189, 21),
                of(207, 23),
                of(0, 0),
                of(16, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void multiply(int expected, int number) {
        int result = easyMultiplicationCalculator.multiply(number);
        assertEquals(expected, result);

    }



}
