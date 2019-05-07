package io.github.bael.unit7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(300, new PositiveCalculator().add(- 200, 300));
    }
}