package org.example.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlphabetPosition {

    public int[] findPositions(String[] words) {
        return Arrays.stream(words)
                .mapToInt(word -> (int) IntStream.range(0, word.length())
                        .filter(i -> Character.toLowerCase(word.charAt(i)) - 'a' == i)
                        .count())
                .toArray();
    }
}
