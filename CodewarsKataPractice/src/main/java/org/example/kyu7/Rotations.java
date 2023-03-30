package org.example.kyu7;

import java.util.List;
import java.util.stream.IntStream;

public class Rotations {

    //Codewars Link: https://www.codewars.com/kata/5700c9acc1555755be00027e/

    public boolean containsAllRotations(String str, List<String> arr) {
        if (str.isEmpty()) {
            return true;
        }
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.substring(i) + str.substring(0, i))
                .filter(rotation -> rotation.length() == str.length())
                .allMatch(arr::contains);
    }
}
