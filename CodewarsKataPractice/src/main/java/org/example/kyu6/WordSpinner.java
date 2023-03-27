package org.example.kyu6;

import java.util.Arrays;

public class WordSpinner {

    public String spinWords(String sentence) {
        String[] sentenceList = sentence.split(" ");
        String newSentence = "";
        for (String word : sentenceList) {
            if (word.length() >= 5) {
                char[] wordList = word.toCharArray();
                String reversedWord = "";
                for (int i = wordList.length - 1; i >= 0; i--) {
                    reversedWord += wordList[i];
                }
                newSentence += reversedWord;
            } else {
                newSentence += word;
            }
        }
        return newSentence;
    }

}
