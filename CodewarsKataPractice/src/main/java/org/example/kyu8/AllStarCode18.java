package org.example.kyu8;

public class AllStarCode18 {
    public int stringCount(String str, char letter) {
        return (int) str.chars().filter(ch -> ch == letter).count();
    }
}
