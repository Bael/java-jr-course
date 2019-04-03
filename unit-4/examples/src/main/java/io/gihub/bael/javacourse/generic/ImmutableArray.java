package io.gihub.bael.javacourse.generic;

/**
 * Обобщенный неизменяемый (почти) массив
 * */
public class ImmutableArray<T> {
    private T[] items;

    public ImmutableArray(T[] items) { this.items = items.clone(); }

    public T get(int index) { return items[index]; }

    public int length() { return items.length; }


}