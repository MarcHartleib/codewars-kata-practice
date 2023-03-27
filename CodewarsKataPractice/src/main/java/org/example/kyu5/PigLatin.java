package org.example.kyu5;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class PigLatin {

    public String convertToPigLatin(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (Pattern.matches("\\p{IsPunctuation}", word)) {
                sb.append(word)
                        .append(" ");
            } else {
                sb.append(word.substring(1))
                        .append(word.charAt(0))
                        .append("ay ");
            }
        }

        while (sb.charAt(sb.length() - 1) == ' ') {
            sb.setLength(sb.length() - 1);
        }

        return new String(sb);
    }

    public String convertWithStream(String str) {
        return Stream.of(str.split("\\s"))
                .map(word -> word.substring(1))
                .map(word -> word + "ay ")
                .toList().toString();
    }
}
