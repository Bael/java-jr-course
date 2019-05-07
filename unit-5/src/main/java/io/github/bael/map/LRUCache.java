package io.github.bael.map;

import java.util.LinkedHashMap;
import java.util.Map;

// based on https://stackoverflow.com/questions/27475797/use-linkedhashmap-to-implement-lru-cache
public class LRUCache<T> extends LinkedHashMap<T, T> {
    private int size;


    private LRUCache(int size) {
        super(size, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<T, T> eldest) {
        return size() > size;
    }

    public static <T> LRUCache<T> newInstance(int size) {
        return new LRUCache<T>(size);
    }

    public void addElement(T elem) {
        put(elem, elem);
    }

    public void getElement(T elem) {
        get(elem);
    }



}
