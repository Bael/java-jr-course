package io.github.bael.unit7;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdding() {
        Calculator a = new Calculator();
        Assert.assertEquals(4, a.add(1, 3));
    }


    @Test
    public void testSub() {
        Assert.assertEquals(199, SimpleAdder.sub(200, 1));
    }


}