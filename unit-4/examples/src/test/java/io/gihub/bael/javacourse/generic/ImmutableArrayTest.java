package io.gihub.bael.javacourse.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayTest {

    @Test
    public void testDoubleArray() {
        ImmutableArray<Double> arr = new ImmutableArray<>(new Double[] {2.0, 3.1, 4.0});

        Assert.assertEquals(3.1, arr.get(1), .00000000001);
        // ??? Действительно ли массив неизменяемый?

    }

}