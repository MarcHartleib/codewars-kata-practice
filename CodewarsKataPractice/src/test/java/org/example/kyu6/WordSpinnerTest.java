package org.example.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class WordSpinnerTest {

    WordSpinner wordSpinner = new WordSpinner();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("emocleW", "Welcome"),
                of("Hey wollef sroirraw", "Hey fellow warriors"),
                of("This is a test", "This is a test")
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void spinWords(String expected, String words) {
        String result = wordSpinner.spinWords(words);
        assertEquals(expected, result);
    }

}