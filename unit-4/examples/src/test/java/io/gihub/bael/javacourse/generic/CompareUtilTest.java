package io.gihub.bael.javacourse.generic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareUtilTest {

    @Test
    public void compare() {

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = CompareUtil.<Integer, String>compare(p1, p2);

        // type interference
        boolean sameToo = CompareUtil.compare(p1, p2);

        assertEquals(same, sameToo);
        assertFalse(same);
    }
}