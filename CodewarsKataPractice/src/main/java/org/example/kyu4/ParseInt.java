package org.example.kyu4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseInt {

    public int parseIntReloaded(String numberString) {
        Map<String, Integer> numberWords = new HashMap<>();
        numberWords.put("zero", 0);
        numberWords.put("one", 1);
        numberWords.put("two", 2);
        numberWords.put("three", 3);
        numberWords.put("four", 4);
        numberWords.put("five", 5);
        numberWords.put("six", 6);
        numberWords.put("seven", 7);
        numberWords.put("eight", 8);
        numberWords.put("nine", 9);
        numberWords.put("ten", 10);
        numberWords.put("eleven", 11);
        numberWords.put("twelve", 12);
        numberWords.put("thirteen", 13);
        numberWords.put("fourteen", 14);
        numberWords.put("fifteen", 15);
        numberWords.put("sixteen", 16);
        numberWords.put("seventeen", 17);
        numberWords.put("eighteen", 18);
        numberWords.put("nineteen", 19);
        numberWords.put("twenty", 20);
        numberWords.put("thirty", 30);
        numberWords.put("forty", 40);
        numberWords.put("fifty", 50);
        numberWords.put("sixty", 60);
        numberWords.put("seventy", 70);
        numberWords.put("eighty", 80);
        numberWords.put("ninety", 90);
        numberWords.put("hundred", 100);
        numberWords.put("thousand", 1000);
        numberWords.put("million", 1000000);

        int result = 0;
        int tempResult = 0;
        int prev = 0;
        String[] words = numberString.split("\\W+and\\W+|\\W+");
        for (String word : words) {
            int value = numberWords.get(word);
            if (value < 20) {
                tempResult += value;
            } else if (value < 100) {
                tempResult += value;
                tempResult -= prev;
                prev = value;
            } else {
                tempResult *= value;
                result += tempResult;
                tempResult = 0;
            }
        }
        return result + tempResult;

    }

}
