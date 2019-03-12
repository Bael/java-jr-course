package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

public class DamageRange {
    private final int minValue;
    private final int maxValue;


    public DamageRange(int minValue, int maxValue) {
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
