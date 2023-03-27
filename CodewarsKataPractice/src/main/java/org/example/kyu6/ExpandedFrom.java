package org.example.kyu6;

import java.util.Arrays;

public class ExpandedFrom {
    public String expandedForm(int num) {
        String[] intStr = Integer.toString(num).split("");
        String result = "";

        for (int i = 0; i < intStr.length - 1; i++) {
            if (Integer.parseInt(intStr[i]) > 0) {
                for (int j = i; j < intStr.length - 1; j++) {
                    intStr[i] += "0";
                }
            }
        }
        result = Arrays.toString(intStr);
        return result
                .substring(1, result.length() - 1)
                .replace(", 0", "")
                .replace(",", " +");
    }
}
