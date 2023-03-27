package org.example.kyu6;

import java.util.Arrays;

public class SortTheOdd {

    public int[] sort(int[] array) {
        int[] odd = Arrays.stream(array)
                .sorted()
                .filter(i -> i % 2 != 0)
                .toArray();

        for (int i = 0, j = 0; i < array.length; i++) {
            array[i] = array[i] % 2 == 1 ? odd[j++] : array[i];
        }
        return array;
    }
}

