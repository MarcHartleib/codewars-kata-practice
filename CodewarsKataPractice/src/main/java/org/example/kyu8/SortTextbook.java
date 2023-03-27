package org.example.kyu8;


import java.util.*;

public class SortTextbook {
    public List<String> sort(List<String> textbooks) {
        textbooks.sort(Comparator.comparing(String::toLowerCase));
        return textbooks;
    }
}
