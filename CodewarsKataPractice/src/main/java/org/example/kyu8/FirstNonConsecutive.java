package org.example.kyu8;

import java.util.stream.IntStream;

public class FirstNonConsecutive {
    public Integer find(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i + 1];
            }
        }
        return null;
    }

    public Integer findStream(int[] array) {
        return IntStream.range(0, array.length -1)
                .filter(i -> array[i] + 1 != array[i + 1])
                .mapToObj(i -> array[i])
                .findFirst()
                .orElse(null);
    }
}
