package org.example.kyu8;

public class Pythagorean {
    public int pythagoreanTriple(int[] triple) {
            if (Math.pow(triple[0], 2) + Math.pow(triple[1], 2) == Math.pow(triple[2], 2)) {
                return 1;
            } else if (Math.pow(triple[2], 2) + Math.pow(triple[1], 2) == Math.pow(triple[0], 2)) {
                return 1;
            } else if (Math.pow(triple[0], 2) + Math.pow(triple[2], 2) == Math.pow(triple[1], 2)) {
                return 1;
            }
            return 0;
        }
}
