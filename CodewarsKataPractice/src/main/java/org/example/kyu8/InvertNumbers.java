package org.example.kyu8;

import java.util.Arrays;

public class InvertNumbers {
    public int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        return result;
    }

    public int[] invertStream(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}
