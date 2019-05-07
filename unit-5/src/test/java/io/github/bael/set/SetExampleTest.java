package io.github.bael.set;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

public class SetExampleTest {

    @Test
    public void testLinkedSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for(String elem: set) {
//            System.out.println(elem);
//        }

    }

    @Test
    public void testHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private Set<String> fillSet(Set<String> set) {
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");
        return set;
    }

    @Test
    public void testTreeSet() {
        Set<String> set = fillSet(new TreeSet<>());
        set.add("a");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testTreeSetReversed() {
        Comparator<String> comp = Comparator.reverseOrder();

        Set<String> set = fillSet(new TreeSet<>(comp));

        set.add("a");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testIntersection() {
        Set<String> A = new TreeSet<>();
        A.add("left");
        A.add("middle");

        Set<String> B = new HashSet<>();
        B.add("right");
        B.add("middle");

        A.retainAll(B);
        System.out.println(A);
    }

    @Test
    public void testMinus() {
        Set<String> A = new TreeSet<>();
        A.add("left");
        A.add("middle");

        Set<String> B = new HashSet<>();
        B.add("right");
        B.add("middle");

        A.removeAll(B);
        System.out.println(A);
    }

    @Test
    public void testPlus() {
        Set<String> A = new TreeSet<>();
        A.add("left");
        A.add("middle");

        Set<String> B = new HashSet<>();
        B.add("right");
        B.add("middle");

        A.addAll(B);
        System.out.println(A);
        assertTrue(A.contains("left"));
        assertTrue(A.contains("right"));
        assertTrue(A.contains("middle"));
    }

}