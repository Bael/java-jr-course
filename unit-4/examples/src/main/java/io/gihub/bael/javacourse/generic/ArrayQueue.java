package io.gihub.bael.javacourse.generic;

import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {

    private Object[] internal;
    private final static int INIT_SIZE = 100;
    private int head = 0, tail = 0;

    public ArrayQueue() {
        internal = new Object[INIT_SIZE];
    }


    @Override
    public void add(T element) {
        internal[++tail] = element;
        if (tail == INIT_SIZE) {
            increaseSize(INIT_SIZE * 2);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T poll() {
        return (T) internal[head++];
    }


    private void increaseSize(int newSize) {
        Object[] zeroHeadInternal = Arrays.copyOfRange(internal, head, tail);
        internal = Arrays.copyOf(zeroHeadInternal, newSize);
    }
}
