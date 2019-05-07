package io.github.bael.unit7;

public class PositiveCalculator implements SimpleAdder, PositiveAdder {
    @Override
    public int add(int a, int b) {
        return PositiveAdder.super.add(a, b);
    }
}
