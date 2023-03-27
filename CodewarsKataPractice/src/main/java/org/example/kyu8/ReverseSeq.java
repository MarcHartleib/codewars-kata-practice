package org.example.kyu8;

import java.util.stream.IntStream;

public class ReverseSeq {

    public int[] reverse(int n) {
        int[] arr = new int[n];

        for (int i = n, j = 0; i  > 0; i--) {
            arr[j] = i;
            j++;
        }
        return arr;
    }

    public int[] reverseStream(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}
