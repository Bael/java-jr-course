package io.github.bael.map;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class MapExampleTest {


    @Test
    public void testHashCode() {

        List<String> list = new ArrayList<>();
        list.add("a");

        HashMap<List<String>, List<String>> map = new HashMap<>();
        map.put(list, list);

        // System.out.println("hash before " + list.hashCode());

        assertTrue(map.containsKey(list)); //

        // But now we mutate the list:

        list.add("goodbye");

        // System.out.println("hash after " + list.hashCode());

        // And it no longer appears in the set!
        //  → false!
        assertFalse(map.containsKey(list));

    }

}