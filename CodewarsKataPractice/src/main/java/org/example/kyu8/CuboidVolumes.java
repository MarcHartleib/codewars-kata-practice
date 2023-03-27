package org.example.kyu8;

public class CuboidVolumes {
    public int calculateDiff(int[] firstCuboid, int[] secondCuboid) {
        int firstVol = 1;
        int secondVol = 1;
        for (int i : firstCuboid) {
            firstVol *= i;
        }
        for (int i : secondCuboid) {
            secondVol *= i;
        }
        return Math.abs(firstVol - secondVol);

    }
}
