package io.github.bael.unit7;

public class IntegerAccumulator {

    // (Integer1, Integer2) -> Integer3
    private final Integer2IntegerOperation accumulator;
    private int value;


    public IntegerAccumulator(int val, Integer2IntegerOperation accumulator) {
        this.accumulator = accumulator;
        this.value = val;
    }

    public static Integer minValue(Integer a, Integer b) {
        return Math.min(a, b);
    }

    public void add(int val) {
        this.value = accumulator.operate(this.value, val);
    }

    public int getValue() {
        return value;
    }
}
