package io.github.bael.set;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class HashCodeExampleTest {

    @Test
    public void testHashCode() {
        List<String> list = new ArrayList<>();
        list.add("a");

        Set<List<String>> set = new HashSet<List<String>>();
        set.add(list);

        // System.out.println("hash before " + list.hashCode());

        assertTrue(set.contains(list)); //

        // But now we mutate the list:

        list.add("goodbye");

        // System.out.println("hash after " + list.hashCode());

        // And it no longer appears in the set!

        assertFalse(set.contains(list)); //  → false!
    }
}