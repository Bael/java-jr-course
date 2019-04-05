package io.gihub.bael.javacourse.nongeneric;
import java.util.Arrays;

public class ArrayIntegerQueue implements IntegerQueue {
    private final static int INIT_SIZE = 100;
    private Integer[] internal;
    private int head = 0, tail = 0;
    public ArrayIntegerQueue() { internal = new Integer[INIT_SIZE]; }

    @Override
    public void add(Integer element) {
        internal[++tail] = element;
        if (tail == INIT_SIZE) {
            increaseSize(INIT_SIZE * 2);
        }
    }

    @Override
    public Integer poll() {
        return internal[head++];
    }

    private void increaseSize(int newSize) {
        Integer[] zeroHeadInternal = Arrays.copyOfRange(internal, head, tail);
        internal = Arrays.copyOf(zeroHeadInternal, newSize);
    }
}
