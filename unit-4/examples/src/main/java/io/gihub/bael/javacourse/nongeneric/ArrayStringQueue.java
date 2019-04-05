package io.gihub.bael.javacourse.nongeneric;

import java.util.Arrays;

public class ArrayStringQueue implements StringQueue {
    private final static int INIT_SIZE = 100;
    private String[] internal;
    private int head = 0, tail = 0;

    public ArrayStringQueue() {
        internal = new String[INIT_SIZE];
    }

    public void add(String element) {

        internal[++tail] = element;
        if (tail == INIT_SIZE) {
            increaseSize(INIT_SIZE * 2);
        }
    }

    @Override
    public String poll() {
        return internal[head++];
    }

    private void increaseSize(int newSize) {
        String[] zeroHeadInternal = Arrays.copyOfRange(internal, head, tail);
        internal = Arrays.copyOf(zeroHeadInternal, newSize);

    }

}
