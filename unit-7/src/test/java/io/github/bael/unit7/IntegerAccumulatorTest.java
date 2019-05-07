package io.github.bael.unit7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerAccumulatorTest {

    @Test
    public void testMaxValue() {
        IntegerAccumulator acc = new IntegerAccumulator(0, (current, element) -> (current > element ? current : element));

        acc.add(2);
        acc.add(-3);
        acc.add(42);
        Assert.assertEquals(42, acc.getValue());
    }

    @Test
    public void testMinValue() {
        IntegerAccumulator acc = new IntegerAccumulator(0, (current, element) -> (current < element ? current : element));

        acc.add(2);
        acc.add(-3);
        acc.add(42);
        Assert.assertEquals(-3, acc.getValue());
    }

    @Test
    public void testMinValue2() {
        IntegerAccumulator acc = new IntegerAccumulator(0, IntegerAccumulator::minValue);

        acc.add(2);
        acc.add(-3);
        acc.add(42);
        Assert.assertEquals(-3, acc.getValue());
    }

    @Test
    public void testSumValue() {
        IntegerAccumulator acc = new IntegerAccumulator(0, (current, element) -> current + element);

        acc.add(2);
        acc.add(-3);
        acc.add(42);
        Assert.assertEquals(41, acc.getValue());
    }

    @Test
    public void testMultiplyValue() {
        IntegerAccumulator acc = new IntegerAccumulator(1, (current, element) -> current * element);

        acc.add(2);
        acc.add(-3);
        acc.add(42);
        Assert.assertEquals(42 * - 6, acc.getValue());
    }

}