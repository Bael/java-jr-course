package io.gihub.bael.javacourse.generic;

public interface Queue<T> {
    void add(T element);
    T poll();
}
