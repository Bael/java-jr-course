package io.github.bael.unit7;

import java.util.function.BiFunction;

public class IntegerAccumulatorEx {

    // (Integer1, Integer2) -> Integer3
    private final BiFunction<Integer, Integer, Integer> accumulator;
    private int value;


    public IntegerAccumulatorEx(int val, BiFunction<Integer, Integer, Integer> accumulator) {
        this.accumulator = accumulator;
        this.value = val;
    }

    public static Integer minValue(Integer a, Integer b) {
        return Math.min(a, b);
    }

    public void add(int val) {
        this.value = accumulator.apply(this.value, val);
    }

    public int getValue() {
        return value;
    }
}
