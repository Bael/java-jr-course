package io.gihub.bael.javacourse.nongeneric;

/*
 * FIFO collection of numbers
 * */
public interface IntegerQueue {
    void add(Integer element);
    Integer poll();
}