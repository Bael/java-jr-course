package io.gihub.bael.javacourse.nongeneric;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayIntegerQueueTest {

    @Test
    public void add() {
        ArrayIntegerQueue aiq = new ArrayIntegerQueue();
        for (int i=0; i<20; i++) {
            aiq.add(i);
        }

        for (int i=0; i<20; i++) {
            Assert.assertTrue(aiq.poll().equals(i));

        }
    }


}