package org.example.kyu7;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SortNumber {

    public int sortDescOrder(int number) {
        return Integer.parseInt(String.valueOf(number)
                .chars()
                .mapToObj(c -> String.valueOf(Character.getNumericValue(c)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
