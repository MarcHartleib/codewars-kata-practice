package org.example.kyu7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class ListManipulationTest {

    ListManipulation listManipulation = new ListManipulation();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(List.of(), List.of()),
                of(List.of(), List.of("a")),
                of(List.of(), List.of("a", "b")),
                of(List.of(1), List.of(1, "a")),
                of(List.of(1, 2), List.of(1, 2)),
                of(List.of(0), List.of(0)),
                of(List.of(-1), List.of(-1)),
                of(List.of(1), List.of(1, "2")),
                of(List.of(), List.of("1", "2")),
                of(List.of(1, 2, 123), List.of(1, 2, "aasf", "1", "123", 123, true, false)),
                of(List.of(1, 2, 3), List.of(1, 2, 3)),
                of(List.of(1, 2, 3), List.of(1, 2, 3, "a", "b", "c")),
                of(List.of(0), List.of(false, 0, "a"))

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void filterList(List<Object> expected, List<Object> list) {
        List<Object> result = listManipulation.filterList(list);
        assertEquals(expected, result);
    }
}