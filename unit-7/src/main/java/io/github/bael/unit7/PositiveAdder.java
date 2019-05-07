package io.github.bael.unit7;

public interface PositiveAdder {
    default int add(int a, int b) {
        return Math.max(0, a) + Math.max(0, b);
    }
}
