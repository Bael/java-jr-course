package io.github.bael.map;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void addElement() {
        LRUCache<String> cache = LRUCache.newInstance(2);
        cache.addElement("first");
        cache.addElement("second");
        cache.addElement("third");
        // продвигаем элемент через доступ наверх кэша
        cache.getElement("second");
        cache.addElement("fourth");

        assertTrue(cache.containsKey("second"));
        assertTrue(cache.containsKey("fourth"));

        System.out.println(cache);

    }
}