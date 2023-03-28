package org.example.kyu7;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenSort {

    public String sortString(String sequence) {
        String evenString = IntStream.range(0, sequence.length())
                .filter(c -> c % 2 == 0)
                .mapToObj(sequence::charAt)
                .map(Objects::toString)
                .collect(Collectors.joining());
        String oddString = IntStream.range(0, sequence.length())
                .filter(c -> c % 2 != 0)
                .mapToObj(sequence::charAt)
                .map(Objects::toString)
                .collect(Collectors.joining());

        return oddString.length() == 0 ? evenString : evenString + " " + oddString;
    }
}
