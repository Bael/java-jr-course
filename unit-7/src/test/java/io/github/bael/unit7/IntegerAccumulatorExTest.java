package io.github.bael.unit7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerAccumulatorExTest {

    @Test
    public void minValue() {
        IntegerAccumulatorEx ex = new IntegerAccumulatorEx(-100, IntegerAccumulatorEx::minValue);
        ex.add(-99);
        ex.add(9000);
        Assert.assertEquals(-100, ex.getValue());
    }
}