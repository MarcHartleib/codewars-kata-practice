package org.example.kyu7;

import java.util.List;
import java.util.stream.Collectors;

public class ListManipulation {
    //Codewwars Link https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

    public List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
    }
}
