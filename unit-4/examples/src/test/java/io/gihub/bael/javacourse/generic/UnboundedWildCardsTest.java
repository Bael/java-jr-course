package io.gihub.bael.javacourse.generic;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class UnboundedWildCardsTest {

    @Test
    public void printList() {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        List<Object> lo = Arrays.asList("one", "two", "three");
        //UnboundedWildCards.printList(li); // does not compile
        // UnboundedWildCards.printList(ls); // does not compile
        UnboundedWildCards.printList(lo);
    }

    @Test
    public void printList2() {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        UnboundedWildCards.printList2(li);
        UnboundedWildCards.printList2(ls);

    }


}