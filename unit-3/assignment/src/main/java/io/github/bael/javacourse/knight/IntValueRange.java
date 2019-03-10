package io.github.bael.javacourse.knight;

public class IntValueRange {
    private final int minValue;
    private final int maxValue;


    public IntValueRange(int minValue, int maxValue) {
        if (minValue > maxValue) {
            throw new IllegalArgumentException();
        }
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    private int range() {
        return maxValue - minValue;
    }
    public int getValue(Chance chance) {

        return range() * chance.getProbability() / 100;


    }
}
