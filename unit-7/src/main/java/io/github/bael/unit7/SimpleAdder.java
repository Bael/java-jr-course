package io.github.bael.unit7;

public interface SimpleAdder {

    default int add(int a, int b) {
        return a + b;
    }


    static int sub(int a, int b) {
        return a - b;
    }

}

